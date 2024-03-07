package SS7_ABSTRACT_INTERFACE.TH.LopHinhHoc;

import SS5_ACCESS_MODIFIER.BT.Circle;

public interface Comparable<C extends Circle> {
    int compareTo(ComparableCircle o);
}
