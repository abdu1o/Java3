package Task1;

public class Pilot extends Human {

    private String aircraftType;

    public Pilot(String name, int age, int numberOfChildren, String aircraftType) {
        super(name, age, numberOfChildren);
        this.aircraftType = aircraftType;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Aircraft Type: " + aircraftType;
    }
}
