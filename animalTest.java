package com.example.Anudip_3LabQuestion;

// Superclass
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// First subclass extending Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Second subclass extending Dog (multilevel inheritance)
class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test the program
public class animalTest {
    public static void main(String[] args) {
        // Creating objects of each class
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Displaying sounds
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}