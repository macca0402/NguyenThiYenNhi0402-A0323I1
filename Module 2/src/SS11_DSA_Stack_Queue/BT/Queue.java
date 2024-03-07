package SS11.BT;
class Node{
    int data;
    Node link;
    Node(int x){
        this.data=x;
        this.link=null;
    }
}
class Queue{
    Node front;
    Node rear;
    Queue(){
        this.rear=null;
        this.front=null;
    }
    void enQueue(int data){
        Node newNode= new Node(data);
        if(this.rear ==null){
            this.front=this.rear=newNode;
            return;
        }
        this.rear.link=newNode;
        this.rear=newNode;
    }
    Node deQueue(){
        if(this.front == null){
            return null;
        }
        Node tam=this.front;
        this.front=this.front.link;
        if(this.front ==null){
            this.rear=null;
        }
        return tam;
    }
    void displayQueue(){
        if(front ==null){
            System.out.println("Queue rong.");
            return;
        }
        Node tam=front;
        while (tam !=null){
            System.out.println(tam.data+" ");
            tam=tam.link;
        }

    }
}
class solution{
    public static void main(String[] args) {
        Queue queue= new Queue();
        queue.enQueue(10);
        queue.enQueue(12);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(6);
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();
    }
}

