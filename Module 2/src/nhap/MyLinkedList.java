package nhap;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    private Node head;
    private int numNodes = 0;

    /**
     * Phương thức khởi tạo không có tham số
     */
    public MyLinkedList() {

    }

    /**
     * Phương thức thêm đối tượng tại vị trí thứ index trong MyLinkedList
     */
    public void add(int index, E data) {
        //Khai báo 1 node temp để chứa node đầu tiên
        Node temp = head;
        //Khai báo Node holder
        Node holder;
        //Cho con trỏ chạy đến vị trí index -1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        //holder tham chiếu đến node tại vị trí index
        holder = temp.next;
        //node tại vị trí index -1 trỏ tới node mới
        temp.next = new Node(data);
        //Node mới trỏ tới holder
        temp.next.next = holder;
        //tăng số lượng phần tử lên 1
        numNodes++;
    }

    /**
     * Phương thức trả về số phần tử trong danh sách
     */
    public int size() {
        return numNodes;
    }

    /**
     * Phương thức add 1 phần tử vào vị trí đầu tiên
     */
    public void addFirst(E e) {
        //Khai báo 1 biến temp tham chiếu đến giá trị của head
        Node temp = head;
        //head nhận giá trị là node mới
        head = new Node(e);
        //head trỏ đến biến temp là head cũ
        head.next = temp;
        //tăng số lượng phần tử của danh sách lên 1
        numNodes++;
    }

    /**
     * Phương thức thêm phần tử vào vị trí cuối cùng
     */
    public void addLast(E e) {
        //khai báo Node trỏ đến node head
        Node temp = head;
        //Cho con trỏ chạy đến phần tử cuối cùng (phân tử cuối cùng sẽ có next == null)
        while (temp.next != null) {
            temp = temp.next;
        }
        //Phần tử cuối cùng sẽ trỏ đến node mới
        temp.next = new Node(e);
        numNodes++;
    }

    /**
     * Phương thức trả về data theo index
     */
    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    /**
     * Remove 1 phần tử ở vị trí index
     */
    public E remove(int index) {
        // Kiểm tra điều kiện index,throw exception nếu index lớn hơn số lượng node haocwj nhỏ hơn 0
        if (index > numNodes || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        //Khai báo 1 node trỏ đến head
        Node temp = head;
        //Khai báo đối tượng object để nhận dữ liệu trả về
        Object data;
        //Nếu index =0 thì trả về data hiện tại và head mới sẽ là node kế tiếp
        if (index == 0) {
            data = temp.data;
            head = head.next;
        } else {
            // Nếu index >0 cho con trỏ chạy đến index -1
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
                ;
            }
            //data trỏ đến node index
            data = temp.next.data;
            //node index trỏ tới index +1
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }

    /**
     * Phương thức remove 1 đối tượng
     */
    public boolean remove(E element) {
        //remove nếu đối tượng là head
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            // Khai báo một node trỏ đến head;
            Node temp = head;
            //Cho vòng lặp chạy đến hết danh sách
            while (temp.next != null) {
                // Nếu tồn tại 1 phần tử có data bằng data truyền vào thì node đó sẽ trỏ đến node thứ 2 kế tiếp
                if (temp.next != null) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Phương thức tạo ra bản sao của 1 danh sách
     */
    public MyLinkedList<E> clone() {
        // Nếu số phần tử =0 thì throw exception
        if (numNodes == 0) {
            throw new NullPointerException();
        }
        //Khai báo danh sách trả về
        MyLinkedList<E> temp = new MyLinkedList<E>();
        //Khai báo node trỏ đến head
        Node tempNode = head;
        // add head vào danh sách trả về
        temp.addFirst((E) tempNode.data);
        //trổ đến node kế tiếp
        tempNode = tempNode.next;
        //add tất cả node kế tiếp vào danh sách
        while (tempNode != null) {
            temp.addLast((E) tempNode.data);
            tempNode = tempNode.next;
        }
        return temp;
    }


    /***
     * Phương thức kiểm tra 1 phần tử có tồn tại trong dánh sách hay không
     */
    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)) {
            return true;
        }
        return false;
    }

    /**
     * Phương thức trả về vị trí của 1 phần tử trong danh sách
     */
    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((E) temp.getData() == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }


}
