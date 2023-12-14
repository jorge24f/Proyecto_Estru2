package Package1;
import java.util.Random;

public class Persona {
    
    private int id;
    private String name;
    private int age;
    private int cityid;

    public Persona() {
    }

    public Persona(int id, String name, int age, int cityid) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cityid = cityid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 1 && id <= 9901) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 20) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        }
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        if (cityid >= 1 && cityid <= 99) {
            this.cityid = cityid;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", name=" + name + ", age=" + age + ", cityid=" + cityid + '}';
    }
    
}