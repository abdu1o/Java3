package Task1;

public class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, int numberOfChildren, String specialization) {
        super(name, age, numberOfChildren);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Specialization: " + specialization;
    }
}
