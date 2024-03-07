package codegym.vn.entity;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String address;
    private List<String> hobbies;
    public Student(){}

    public Student(String id, String name, String address, List<String> hobbies) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hobbies = hobbies;
    }

    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    public String displayHobbies(){
        if(hobbies == null){
            return "";
        }
        StringBuilder builder=new StringBuilder();
        boolean flag=true;
        for(String hobbie: hobbies){
            if(flag){
                flag=false;
            } else{
                builder.append(",");
            }
            builder.append(hobbie);
        }
        return builder.toString();
    }
}
