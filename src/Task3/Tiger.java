package Task3;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name, true, 5000);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }
}
