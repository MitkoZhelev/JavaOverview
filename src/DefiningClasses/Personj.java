package DefiningClasses;

public class Personj {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    public Personj () {
        this.age = 1;
        this.name = "No name";
    }
    public Personj (int age) {
    this.age = age;
    this.name = "No name";
    }
    public Personj (int age, String name)
    {
        this.age = age;
        this.name = name;
    }
}
