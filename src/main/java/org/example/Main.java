package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car C1 = new Car("SuperStar", "Civic", 2022, 4);
        C1.displayInfo();

        Bike B1 = new Bike("Honda", "Happy", 2024, "Sports");
        B1.displayInfo();

        Truck T1 = new Truck("Ford-FSeries", "BeSpoke", 2025, 20.5);
        T1.displayInfo();
    }
}

class Vehicle {
    String Make;
    String Model;
    int Year;

    Vehicle(String Make, String Model, int Year) {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
    }
}

class Car extends Vehicle {
    int Doors;

    Car(String Make, String Model, int Year, int Doors) {
        super(Make, Model, Year);
        this.Doors = Doors;
    }

    void displayInfo() {
        System.out.println("Make: " + Make);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
        System.out.println("Doors: " + Doors);
    }
}

class Bike extends Vehicle {
    String Type;

    Bike(String Make, String Model, int Year, String Type) {
        super(Make, Model, Year);
        this.Type = Type;
    }

    void displayInfo() {
        System.out.println("Make: " + Make);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
        System.out.println("Type: " + Type);
    }
}

class Truck extends Vehicle {
    double weight;

    Truck(String Make, String Model, int Year, double weight) {
        super(Make, Model, Year);
        this.weight = weight;
    }

    void displayInfo() {
        System.out.println("Make: " + Make);
        System.out.println("Model: " + Model);
        System.out.println("Year: " + Year);
        System.out.println("Weight: " + weight + " tons");
    }
}



