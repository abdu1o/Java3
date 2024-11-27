package Task3;

import java.util.ArrayList;
import java.util.List;


public class Zoo {
    public List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public int countPredators() {
        int count = 0;
        for (Animal animal : animals) {
            if (animal.isPredator()) {
                count++;
            }
        }
        return count;
    }

    public int calculateTotalFoodRequirement() {
        int totalFood = 0;
        for (Animal animal : animals) {
            totalFood += animal.getDailyFoodRequirement();
        }
        return totalFood;
    }
}
