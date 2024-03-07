package nhap;

import java.util.Arrays;

public class MyArrayList2<E> {
    /*
     * Số lượng phần tử trong MyArrayList
     */
    private int size = 0;
    /*
    Sức chứa mặc định trong MyArrayList
     */
    private static final int Default_Capacity = 10;
    /*
    Mảng đối tượng elements chứa các phần tử trong MyArrayList
     */
    private Object[] elements;

    /**
     * Phương thức khởi tạo không tham số
     * mặc định khi khởi tạo sẽ tạo ra mảng object có kích thước là default-capacity
     */
    public MyArrayList2() {
        System.out.println("Khởi tạo thành công MyArrayList có kích thước là: " + Default_Capacity);
        elements = new Object[Default_Capacity];
    }

    /**
     * Phương thức khởi tạo với kích thước mảng được tuyền vào là tham số capacity
     */
    public MyArrayList2(int capacity) {
        if (capacity > 0) {
            System.out.println("Khoi tao thanh cong voi kich thuoc la: " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Lỗi tham số truyền vào");
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    /**
     * Phương thức tăng kích thước của mảng chứa phần tử
     *
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khoi tao thanh cong voi kich thuoc la: " + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }

    }

    /**
     * Thêm phần tử vào vị trị index
     * 0,1,2,3
     * 4,2
     */
    public void add(E e, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Lỗi index: " + index);
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            size++;
            elements[index] = e;
        } else {
            if (size == elements.length) {
                ensureCapacity(1);
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = e;
            size++;
        }
    }

    /**
     * Phương thức thêm một phần tử vào cuối ArrayList
     */
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    /**
     * Phương thức xóa phần tử tại vị trí index
     */
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
    /**
     * Phương thức trả về kích thước của MyArraylist
     */
    public int size(){
        return size;
    }

    /**
     * Phương thức trả về kích thước của MyArraylist
     */
    public int length() {
        return elements.length;
    }

    /**
     * Phương thức clone 1 arrayList
     */
    public MyArrayList2<E> clone() {
        MyArrayList2<E> v = new MyArrayList2<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = size;
        return v;
    }

    /**
     * Phương thức trả về vị trí của 1 phần tử trong MyArrayList
     */
    public int indexOf(E e) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(e)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Phương thức trả về phần tử tại vị trí index
     */
    public E get(int index) {
        return (E) elements[index];
    }

    /**
     * Phương thức kiểm tra 1 phần tử có tồn tại trong MyArrayList
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }


}
