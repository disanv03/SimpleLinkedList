public class SimpleLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int listSize;

    public void add(E data){
        final Node<E> newNode = new Node<>(data);
        if(this.isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    @Override
    public String toString(){
        Node<E> current = this.head;
        final StringBuilder output = new StringBuilder();
        while(current != null){
            output.append("[");
            output.append(current.getData());
            output.append("]");
            current = current.getNext();
        }
        return output.toString();
    }

    private boolean isEmpty(){
        return this.listSize == 0;
    }



    static class Node<E> {
        private E data;
        private Node next;

        Node (final E data) {
            this.data = data;
        }

        E getData(){
            return this.data;
        }

        Node<E> getNext(){
            return this.next;
        }

        void setNext(final Node<E> node){
            this.next = node;
        }

        @Override
        public String toString(){
            return this.data.toString();
        }
    }

    public static void main (String[] args){
        final SimpleLinkedList<String> linkedList = new SimpleLinkedList<>();
        linkedList.add("see");
        linkedList.add("spot");
        linkedList.add("run!");
        System.out.println(linkedList);
    }

}
