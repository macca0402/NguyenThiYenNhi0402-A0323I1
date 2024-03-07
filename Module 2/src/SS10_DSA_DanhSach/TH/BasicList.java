package SS10.TH;

import java.util.Arrays;
import java.util.Objects;

public class BasicList<E> {
    private int size = 0;
    private int Default_Capacity = 10;
    private Object elements[];

    public BasicList() {
        elements = new Object[Default_Capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements= Arrays.copyOf(elements,newSize);
    }
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public E get (int i){
        if(i>=size || i<0){
            throw new IllegalArgumentException("Index : "+ i+",Size "+ i);
        }
        return (E) elements[i];
    }
}
