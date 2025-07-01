// 1. Create an abstract class called Bird with an abstract method called fly().
//  Implement two subclasses called Eagle and Penguin that inherit from Bird.
//   Override the fly() method in both subclasses, ensuring Eagle can fly while Penguin cannot.
   // Implement the Java code for this scenario.

abstract class Bird {
    public abstract void fly();
}

class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying high in the sky");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        System.out.println("Penguin cannot fly");
    }
}


// 2. Create an abstract class called Shape with an abstract method called calculateArea().
//  Implement two subclasses called Rectangle and Circle that inherit from Shape. 
//  Override the calculateArea() method in both subclasses to calculate and return the area of a rectangle and a circle, 
//  respectively. Write the Java code to implement this scenario with Scanner Input.

import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();
        Rectangle rect = new Rectangle(length, width);
        System.out.println("Rectangle area: " + rect.calculateArea());
        
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle area: " + circle.calculateArea());
        
        scanner.close();
    }
}

// 3. Create an abstract class called Vehicle with abstract methods startEngine() and stopEngine().
//  Implement two subclasses called Car and Motorcycle that inherit from Vehicle. 
//  Implement the startEngine() and stopEngine() methods in both subclasses to start and 
//  stop the engines of a car and a motorcycle, respectively. 

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with key ignition");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped by turning key off");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with kick start");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped by turning key off");
    }
}

// 4. You are building a shape hierarchy for a drawing application.
//  Design an abstract class named "Shape" with the following abstract methods:
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Circle," "Rectangle," and "Triangle." 
// Each subclass should provide specific implementations for calculating the area and perimeter of that shape. 
// Create instances of each shape class and demonstrate how you can calculate their respective areas and perimeters.

abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

// 5. You are building a shape hierarchy for a drawing application. 
// Design an abstract class named "Draw" with the following abstract methods:
// calculateVolume(): This method should calculate and return the area of the shape
// calculateArea(): This method should calculate and return the area of the shape.
// calculatePerimeter(): This method should calculate and return the perimeter of the shape.
// Implement the abstract class and provide concrete implementations for the abstract methods. 
// Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder." 
// Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape. 
// Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters.

abstract class Draw {
    public abstract double calculateVolume();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;

    public Cube(double s) {
        side = s;
    }

    @Override
    public double calculateVolume() {
        return side * side * side;
    }

    @Override
    public double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length;
    private double width;
    private double height;

    public Cuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (2 * Math.PI * radius + height);
    }
}

// 6. You are developing a media player application. There is a base class called MediaPlayer, which has methods like play(), pause(), 
// and stop(). The VideoPlayer class inherits from MediaPlayer and adds methods like rewind() and fastForward(). 
// Additionally, there is an interface called Playlist, which defines methods like addSong() and removeSong(). 
// The VideoPlayer class implements the Playlist interface.
//  Implement the classes and demonstrate inheritance with interface by creating objects of the VideoPlayer class and calling 
//  its methods as well as the interface methods.

class MediaPlayer {
    public void play() {
        System.out.println("Playing media");
    }

    public void pause() {
        System.out.println("Media paused");
    }

    public void stop() {
        System.out.println("Media stopped");
    }
}

interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void rewind() {
        System.out.println("Rewinding video");
    }

    public void fastForward() {
        System.out.println("Fast forwarding video");
    }

    @Override
    public void addSong(String song) {
        System.out.println("Added song: " + song + " to playlist");
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removed song: " + song + " from playlist");
    }
}

// 7. You are developing a restaurant management system that handles different types of employees,
//  such as chefs and waiters. Design an interface named "Employee" with the following methods:
// work(): This method should define the work responsibilities of the employee.
// getSalary(): This method should return the salary of the employee.

interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("Chef is preparing meals");
    }

    @Override
    public double getSalary() {
        return 50000.0;
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("Waiter is serving customers");
    }

    @Override
    public double getSalary() {
        return 30000.0;
    }
}

// 8. You are building a library management system. Design an interface named "LibraryItem" with the following methods:
// String getTitle() to retrieve the title of the library item
// String getAuthor() to retrieve the author of the library item
// int getYear() to retrieve the publication year of the library item
// boolean isAvailable() to check if the library item is currently available for borrowing.
interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title;
    private String author;
    private int year;
    private boolean available;

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
        available = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        available = status;
    }
}