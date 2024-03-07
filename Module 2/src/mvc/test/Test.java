package mvc.test;

import mvc.model.CounterModel;
import mvc.view.CounterView;

public class Test {
    public static void main(String[] args) {
        CounterModel ct=new CounterModel();
        ct.decrease();
        System.out.println(ct.getValue());
        ct.increase();

        System.out.println(ct.getValue());


        CounterView ctv=new CounterView();

    }
}
