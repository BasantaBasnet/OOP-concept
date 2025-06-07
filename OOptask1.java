// 1. Write a Java program to create a class called Vehicle with a method called drive(). 
// Create a subclass called Car with method display() method to print details of the Car.
class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car details: Model X");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.display();
    }
}

// 2. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
// Create a subclass called HRManager that overrides the work() method.

class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    void getSalary() {
        System.out.println("Salary: $5000");
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is hiring employees");
    }
}

public class Main {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.getSalary();
    }
}




// 3. Imagine that you are building a geometry calculator program. 
// You need to implement the calculation of areas for different shapes, 
// including rectangles, squares, and circles. To achieve this, you decide to use a multilevel inheritance hierarchy.


class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a shape");
    }
}

class Rectangle extends Shape {
    void calculateArea(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Square extends Rectangle {
    void calculateArea(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
}

class Circle extends Shape {
    void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.calculateArea(4, 5);

        Square square = new Square();
        square.calculateArea(4);

        Circle circle = new Circle();
        circle.calculateArea(3.0);
    }
}




// 4. Design a class hierarchy for different types of vehicles.
//  Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. 
//  Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. 
//  Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.
class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }

    void stopEngine() {
        System.out.println("Engine stopped");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();

        Motorcycle bike = new Motorcycle();
        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}



// 5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. 
// Derive two classes 'Rectangle' and 'Circle' from 'Shape'. 
// Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. 
// Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference 
// for a rectangle and a circle object.

class Shape {
    void calculateArea() {
        System.out.println("Area calculation");
    }
}

class Rectangle extends Shape {
    void calculateArea(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    void calculatePerimeter(int length, int width) {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }
}

class Circle extends Shape {
    void calculateArea(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    void calculateCircumference(double radius) {
        System.out.println("Circumference of Circle: " + (2 * 3.14 * radius));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.calculateArea(4, 5);
        rect.calculatePerimeter(4, 5);

        Circle circle = new Circle();
        circle.calculateArea(3.0);
        circle.calculateCircumference(3.0);
    }
}



// 6. Let's examine the Java program given. It involves multiple classes that depict different book types, 
// including Book, FictionBook, NonFictionBook, and TechnicalBook. The Book class features a constructor and 
// a method called displayDetails(). This method is responsible for outputting the title and author of a book. 
// The remaining classes inherit both the constructor and methods of the Book class as they extend it.
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class Main {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("Harry Potter", "J.K. Rowling");
        fiction.displayDetails();

        TechnicalBook tech = new TechnicalBook("Clean Code", "Robert Martin");
        tech.displayDetails();
    }
}