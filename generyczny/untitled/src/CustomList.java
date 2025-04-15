public class CustomList<E> {
    private class Node{
        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    Node head;
    Node tail;

    public CustomList() {
        head = null;
        tail = null;
    }

    void addLast(E value){
        
    }

}
