package Task1;

public class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, int numberOfChildren, String shipName) {
        super(name, age, numberOfChildren);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Ship Name: " + shipName;
    }
}
