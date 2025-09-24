package entities;

public class AlturaPessoa {
    private String name;
    private int age;
    private double height;

    public AlturaPessoa(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public double getHeight() {
        return height;
    }
}
