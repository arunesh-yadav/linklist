public class SinglyLinkedlist {
    private class Node{
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head = null;
    private int size=0;

    public static void main(String[] args) {
        SinglyLinkedlist linkedlist=new SinglyLinkedlist();
        System.out.println(linkedlist);
        for (int i = 0; i < 5; i++) {
            linkedlist.insertHead(i+1);
        }
        linkedlist.insertHead(42);
        linkedlist.insertHead(66);

        System.out.println(linkedlist);

    }

    @Override
    public String toString() {
       StringBuilder response = new StringBuilder();
       response.append("[");
       Node temp = this.head;
       while(temp != null)
        {
            response.append(temp.getData());
            if (temp.next != null){
                response.append(" ==> ");
            }
            temp = temp.next;
        }
        response.append("]");

       return response.toString();
    }
    private void insertHead(int data){
        Node newNode =  new Node(data ,this.head);
        this.head = newNode;
        size++;
    }
    private void insertAfter(int data,Node node){
        Node newNode = new Node(data, node.next);
        node.next=newNode;
        size++;
    }
    public void insert (int data){
        if (head==null){
            insertHead(data);
        }
        else
        {
            Node temp = this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            insertAfter(data,temp);
        }
    }
}
