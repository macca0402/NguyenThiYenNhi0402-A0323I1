package nhap;

public class TestMyArrayList {
    static class Person{
        String name;
        int Age;

        Person(String name, int age) {
            this.name = name;
            Age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", Age=" + Age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
//            Person person = (Person) obj;
            return this.name.equals(((Person) obj).name)
                    && this.Age == ((Person) obj).Age;
        }
    }
    public static void main(String[] args) {
        MyArrayList<Person> myArrayList = new MyArrayList<>(3);
        myArrayList.ensureCapacity(4);
        myArrayList.add(new Person("Nguyễn Văn A ", 30));
        myArrayList.add(new Person("Nguyễn Văn B ", 30));
        myArrayList.add(new Person("Nguyễn Văn C ", 30));
        myArrayList.add(new Person("Nguyễn Văn D ", 30),1);
        MyArrayList<Person> list2 = myArrayList.clone();
        int index = list2.indexOf(new Person("Nguyễn Văn C ", 30));
        System.out.println("index = " + index);
        for (int i = 0; i < list2.size(); i++ ){
            System.out.println(myArrayList.get(i).toString());
        }
    }
}
