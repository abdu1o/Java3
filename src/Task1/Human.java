package Task1;

public class Human {
    private String name;
    private int age;
    private int numberOfChildren;

    public Human(String name, int age, int numberOfChildren) {
        this.name = name;
        this.age = age;
        this.numberOfChildren = numberOfChildren;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public String getInfo() {
        return String.format("Name: %s, Age: %d, Children: %d", name, age, numberOfChildren);
    }
}
