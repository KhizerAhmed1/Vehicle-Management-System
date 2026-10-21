# 🚗 Vehicle Inheritance Demo (Java)

A simple Java console application that demonstrates core **Object-Oriented Programming** concepts using a vehicle hierarchy. A base `Vehicle` class is extended by `Car`, `Bike`, and `Truck`, each adding its own details and displaying its information.

## 📌 About

This project shows how inheritance works in Java. Common properties (make, model, year) live in a parent class, while each child class adds what makes it unique and reuses the parent's constructor through `super()`.

## ✨ Features

- A parent `Vehicle` class holding shared data: **Make**, **Model**, and **Year**
- Three child classes that extend it:
  - **Car**: adds the number of doors
  - **Bike**: adds the bike type (e.g., Sports)
  - **Truck**: adds the weight in tons
- Constructor chaining using the `super` keyword
- A `displayInfo()` method in each child class that prints its full details

## 🧠 Concepts Covered

- Classes and objects
- Inheritance (`extends`)
- Constructors and the `super` keyword
- Methods and console output

## 🏗️ Class Structure

```text
            Vehicle
      (Make, Model, Year)
              |
     +--------+--------+
     |        |        |
    Car      Bike    Truck
  (Doors)   (Type)  (weight)
```

## 🛠️ Technology Stack

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| IntelliJ IDEA | Development environment (optional) |

No external libraries are required.

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) installed

Check your installation:

```bash
java -version
```

### Run the project

**1. Clone the repository**

Replace `YOUR_USERNAME` with your GitHub username and use your repository name.

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
cd YOUR_REPOSITORY
```

**2. Compile and run**

From the folder that contains the `org` directory (usually `src/main/java`):

```bash
javac org/example/Main.java
java org.example.Main
```

Or simply open the project in IntelliJ IDEA and click **Run** on `Main`.

## 💻 Sample Output

```text
Make: SuperStar
Model: Civic
Year: 2022
Doors: 4
Make: Honda
Model: Happy
Year: 2024
Type: Sports
Make: Ford-FSeries
Model: BeSpoke
Year: 2025
Weight: 20.5 tons
```

## 🔧 Possible Improvements

- Move `displayInfo()` into the `Vehicle` class and override it in child classes to remove repeated code
- Make fields `private` and add getters and setters
- Add more vehicle types or take input from the user

## 👤 Author

**Khizer Ahmed**
GitHub: [KhizerAhmed1](https://github.com/KhizerAhmed1) 
