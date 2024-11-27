import Task1.Builder;
import Task1.Sailor;
import Task1.Pilot;
import Task1.Human;

import Task2.Course;
import Task2.Group;
import Task2.Student;

import Task3.Zoo;
import Task3.Tiger;
import Task3.Wolf;
import Task3.Rabbit;
import Task3.Kangaroo;
import Task3.Animal;

public class Main {
    public static void main(String[] args) {
        
        //Task1
//        Builder builder = new Builder("Oleg1", 35, 1, "qwe");
//        Sailor sailor = new Sailor("Oleg2", 40, 1, "asd");
//        Pilot pilot = new Pilot("Oleg3", 30, 1, "zxc");
//
//        Human[] friends = { builder, sailor, pilot };
//
//        System.out.println("Friends Info:");
//        for (Human friend : friends) {
//            System.out.println(friend.getInfo());
//        }
//
//        int totalChildren = 0;
//        for (Human friend : friends) {
//            totalChildren += friend.getNumberOfChildren();
//        }
//
//        System.out.println("Total children: " + totalChildren);


        //Task2
//        Course math = new Course("Math", 1, 75);
//        Course history = new Course("History", 1, -1);
//        Course physics = new Course("Physics", 2, 60);
//        Course programming = new Course("Programming", 2, 90);
//
//        Student alice = new Student("qwe");
//        alice.addCourse(math);
//        alice.addCourse(history);
//
//        Student bob = new Student("asd");
//        bob.addCourse(physics);
//        bob.addCourse(programming);
//
//        Student charlie = new Student("zxc");
//        charlie.addCourse(math);
//        charlie.addCourse(physics);
//        charlie.addCourse(history);
//
//        Group group = new Group();
//        group.addStudent(alice);
//        group.addStudent(bob);
//        group.addStudent(charlie);
//
//        System.out.println("Failing Students:");
//        group.getFailingStudents().forEach(System.out::println);
//
//        System.out.println("\nSuccessful Students:");
//        group.getSuccessfulStudents().forEach(System.out::println);
//
//        System.out.println("\nMost Failed Course:");
//        System.out.println(group.getMostFailedCourse());
//
//        System.out.println("\nStudent Ratings:");
//        group.getStudents().forEach(student -> {
//            System.out.printf("%s: %.2f%n", student.getName(), student.getAverageGrade());
//        });

        Zoo zoo = new Zoo();

        zoo.addAnimal(new Tiger("zxc"));
        zoo.addAnimal(new Rabbit("asd"));
        zoo.addAnimal(new Wolf("qwe"));
        zoo.addAnimal(new Kangaroo("vbn"));

        System.out.println("Number of predators: " + zoo.countPredators());

        System.out.println("Total food requirement: " + zoo.calculateTotalFoodRequirement() + " grams");

        for (Animal animal : zoo.animals) {
            System.out.println(animal.getName() + " makes sound: " + animal.makeSound());
        }

    }
}