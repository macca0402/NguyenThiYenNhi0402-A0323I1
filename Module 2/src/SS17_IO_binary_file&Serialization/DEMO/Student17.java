package SS17.DEMO;

import java.io.Serializable;

public class Student17 implements Serializable {
    private String name;
    private int code;
    private String country;

    @Override
    public String toString() {
        return "Student17{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", country='" + country + '\'' +
                '}';
    }

    public Student17(String name, int code, String country) {
        this.name = name;
        this.code = code;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
