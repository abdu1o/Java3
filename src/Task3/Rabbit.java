package Task3;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name, false, 300);
    }

    @Override
    public String makeSound() {
        return "Squeak";
    }
}
