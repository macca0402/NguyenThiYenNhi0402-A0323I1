//package nhap;
//
//import java.util.Arrays;
//
//public class MyArrayList3<E> {
//    /**
//     * Số lượng phần tử trong MyArrayList
//     */
//    private int size = 0;
//
//    /**
//     * Sức chứa mặc định trong MyArraylist
//     */
//    private int  DEFAULT_CAPACITY=10;
//
//    /**
//     * mảng đối tượng elements chứa các phần tử trong MyArrayList
//     */
//    private Object elements[];
//
//    /**
//     * Phương thức khởi tạo không tham số;
//     * mặc định khi khởi tạo sẽ tạo ra mảng object có kích thước là DEFAULT_CAPACITY
//     */
//    public MyArrayList3(){
//        System.out.println("Khởi tạo thành công MyArrayList có kích thước là: "+ DEFAULT_CAPACITY);
//        elements = new Object[DEFAULT_CAPACITY];
//    }
//    /**
//     * Phương thức khỏi tạo với kích thước mảng được truyền vào là tham số capacity
//     *
//     * @param capacity
//     */
//    public MyArrayList3(int capacity){
//        if(capacity>0){
//            System.out.println("Khởi tạo thành công với kích thước là: "+capacity);
//            elements=new Object[capacity];
//        }else{
//            System.out.println("Lỗi tham số truyền vào: "+capacity);
//            throw new IllegalArgumentException("Capacity: "+ capacity)
//        }
//    }
//
//
//    /**
//     * Phương thức tăng kích thước của mảng chứa phần tử
//     *
//     * @param minCapacity
//     */
//    public void ensureCapacity(int minCapacity){
//        if(minCapacity>=0){
//            int newSize=this.elements.length+minCapacity;
//            elements= Arrays.copyOf(elements,newSize);
//            System.out.println("Khoi tao thanh cong voi kich thuoc la : "+ elements.length);
//        }
//        else{
//            throw new IllegalArgumentException("minCapacity : "+minCapacity);
//        }
//    }
//
//
//    /**
//     * Thêm phần tử vào vị trí index
//     * @param e
//     * @param index
//     */
//    public void add (E e,int index){
//        if(index > elements.length){
//            throw new IllegalArgumentException("Lỗi index : "+index);
//        } else if( elements.length == index+1){
//            ensureCapacity(1);
//        }
//        if(elements[index] == null){
//            size++;
//            elements[index]=e;
//        } else{
//            if(size == elements.length){
//                ensureCapacity(1);
//            }
//
//        }
//
//    }
//
//    /**
//     * Phương thức thêm một phần tử vào cuối ArrayList
//     */
//
//
//    /**
//     * Phương thức xoá phần tử tại vị trí index
//     * @param index
//     * @return
//     */
//
//
//    /**
//     * Phương thức trả về số phần tử trong mảng
//     * @return
//     */
//
//
//    /**
//     * Phương thức trả về kích thước của MyArrayList
//     * @return
//     */
//
//
//    /**
//     * Phương thức clone 1 arrayList
//     * @return
//     */
//
//
//    /**
//     * Phương thức trả về vị trí của 1 phần tử trong MyArraylist
//     * @param e
//     * @return
//     */
//
//
//    /**
//     * Phương thức trả về phần tử tại vị trí index
//     * @param index
//     * @return
//     */
//
//    /**
//     * Phương thức kiểm tra 1 phần tử có tồn tại trong MyArrayList hay không
//     * @param e
//     * @return
//     */
//
//
//    /**
//     * phương thức xoá toàn bộ các phần tử trong MyArrayList
//     */
//}
