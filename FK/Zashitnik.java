package FK;

import java.time.LocalDate;

public class Zashitnik extends Sportsman implements position2 {
    public Zashitnik(String firstName, String lastName, LocalDate birthDate, double height, double weight) {
        super(firstName, lastName, birthDate, height, weight);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getFirstName());
        System.out.println("Age: " + getAge());
        System.out.println("Height: " + getHeight() + " cm");
        System.out.println("Weight: " + getWeight() + " kg");
    }

    @Override
    public void position() {
        System.out.println(" position zashita");
    }
}
