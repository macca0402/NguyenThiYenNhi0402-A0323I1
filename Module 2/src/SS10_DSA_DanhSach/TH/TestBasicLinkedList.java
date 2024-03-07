package SS10.TH;

public class TestBasicLinkedList {
    public static void main(String[] args) {
        System.out.println("=====TESTING=====");
        BasicLinkedList bb= new BasicLinkedList(10);
        bb.addFirst(11);
        bb.addFirst(12);
        bb.addFirst(13);
        bb.add(4,9);
        bb.add(4,9);
        bb.printList();
    }
}
