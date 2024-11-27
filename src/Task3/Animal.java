package Task3;

public class Animal {

    private String name;
    private boolean isPredator;
    private int dailyFoodRequirement;

    public Animal(String name, boolean isPredator, int dailyFoodRequirement) {
        this.name = name;
        this.isPredator = isPredator;
        this.dailyFoodRequirement = dailyFoodRequirement;
    }

    public String makeSound() {
        return "Generic animal sound";
    }

    public boolean isPredator() {
        return isPredator;
    }

    public int getDailyFoodRequirement() {
        return dailyFoodRequirement;
    }

    public String getName() {
        return name;
    }
}
