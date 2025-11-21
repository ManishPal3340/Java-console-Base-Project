
package com.example.Anudip_3LabQuestion;
// Superclass (Parent class)
class HillStations {

    void location() {
        System.out.println("Hill Station location");
    }

    void famousFor() {
        System.out.println("Famous for beautiful climate");
    }
}

// Subclass 1
class Manali extends HillStations {

    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for Hadimba Temple and Adventure Sports");
    }
}

// Subclass 2
class Mussoorie extends HillStations {

    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for Educational Institutes");
    }
}

// Subclass 3
class Gulmarg extends HillStations {

    @Override
    void location() {
        System.out.println("Gulmarg is in Jammu & Kashmir");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for Skiing");
    }
}

public class turismLocation {

    public static void main(String[] args) {

        System.out.println("=== Runtime Polymorphism using Parent Class Reference ===");

        HillStations hill;

        hill = new Manali();
        hill.location();
        hill.famousFor();

        hill = new Mussoorie();
        hill.location();
        hill.famousFor();

        hill = new Gulmarg();
        hill.location();
        hill.famousFor();

    }
}
