package SS10.TH;

public class BasicLinkedList {
    private Node head;
    private int numNodes;
    public BasicLinkedList(Object data){
        head =new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    public void add(int index,Object data){
        Node tam=head;
        Node holder;
        for(int i=0;i<index-1 && tam.next!=null;i++){
            tam=tam.next;
        }
        holder=tam.next;
        tam.next=new Node(data);
        tam.next.next=holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node tam=head;
        head= new Node(data);
        head.next=tam;
        numNodes++;
    }
    public Node get(int index){
        Node tam=head;
        for(int i=0;i<index;i++){
            tam=tam.next;
        }
        return tam;
    }
    public void printList(){
        Node tam=head;
        while(tam !=null){
            System.out.println(tam.data);
            tam=tam.next;
        }
    }



}
