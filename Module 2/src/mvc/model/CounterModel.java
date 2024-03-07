package mvc.model;

public class CounterModel {
    private int value;
    public CounterModel(){
        this.value=0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void increase(){
        this.value++;
    }
    public void decrease(){
        this.value--;
    }
    public void reset(){
        this.value=value;
    }
}
