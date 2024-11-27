package Task3;

public class Wolf extends Animal {

    public Wolf(String name) {
        super(name, true, 3000);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
