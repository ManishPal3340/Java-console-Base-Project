package com.example.Anudip_3LabQuestion;

abstract class Vaccine {
    int age;
    String nationality;
    boolean firstDoseTaken = false; // Track vaccination status
    boolean secondDoseTaken = false;

    // Constructor to initialize values
    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    // Scenario 1 → First Dose
    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose completed.");
            System.out.println("Please pay 250 Rs.");
            firstDoseTaken = true;
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    // Scenario 2 → Second Dose
    public void secondDose() {
        if (firstDoseTaken) {
            System.out.println("Second dose completed successfully.");
            secondDoseTaken = true;
        } else {
            System.out.println("You must take the first dose before taking second dose.");
        }
    }

    // Scenario 3 → Abstract Method
    public abstract void boosterDose();
}

// Implementation class
class VaccinationSuccessful extends Vaccine {
    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        if (secondDoseTaken) {
            System.out.println("Booster dose completed successfully.");
        } else {
            System.out.println("You must complete the second dose before taking booster dose.");
        }
    }
}

// Main class
public class Vaccination {
    public static void main(String[] args) {
        // You can change age and nationality to test different outputs
        VaccinationSuccessful person = new VaccinationSuccessful(20, "Indian");

        person.firstDose();      // Scenario 1
        person.secondDose();     // Scenario 2
        person.boosterDose();    // Scenario 3
    }
}
