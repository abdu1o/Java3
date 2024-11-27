package Task3;

public class Kangaroo extends Animal {

    public Kangaroo(String name) {
        super(name, false, 1000);
    }

    @Override
    public String makeSound() {
        return "Thump";
    }
}
