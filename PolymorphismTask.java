// Question 1: Shape drawing application with polymorphism
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Question 2: E-commerce payment processing with polymorphism
interface PaymentMethod {
    boolean validate();
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean validate() {
        return cardNumber.length() == 16 && expiryDate.matches("\\d{2}/\\d{2}");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean validate() {
        return email.contains("@") && email.contains(".");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " from " + email);
    }
}

class BankTransfer implements PaymentMethod {
    private String accountNumber;

    public BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean validate() {
        return accountNumber.length() >= 8;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount + " to account " + accountNumber);
    }
}

// Question 3: Car rental system with polymorphism
abstract class Vehicle {
    protected double baseRate;
    protected int rentalDays;

    public Vehicle(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public abstract double calculateRentalCost();
}

class Car extends Vehicle {
    public Car(int rentalDays) {
        super(rentalDays);
        this.baseRate = 50;
    }

    @Override
    public double calculateRentalCost() {
        return baseRate * rentalDays;
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(int rentalDays) {
        super(rentalDays);
        this.baseRate = 30;
    }

    @Override
    public double calculateRentalCost() {
        return baseRate * rentalDays * 0.9; // 10% discount
    }
}

class Bicycle extends Vehicle {
    public Bicycle(int rentalDays) {
        super(rentalDays);
        this.baseRate = 15;
    }

    @Override
    public double calculateRentalCost() {
        return baseRate * (rentalDays > 7 ? rentalDays - 1 : rentalDays); // 1 day free for rentals >7 days
    }
}

// Question 4: Restaurant ordering system with polymorphism
abstract class MenuItem {
    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void prepare();
    public abstract void serve();
}

class Appetizer extends MenuItem {
    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing appetizer: " + name + " - plating small portions");
    }

    @Override
    public void serve() {
        System.out.println("Serving appetizer: " + name + " with garnish");
    }
}

class MainCourse extends MenuItem {
    public MainCourse(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing main course: " + name + " - cooking and plating main dish");
    }

    @Override
    public void serve() {
        System.out.println("Serving main course: " + name + " with sides");
    }
}

class Beverage extends MenuItem {
    public Beverage(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing beverage: " + name + " - mixing and chilling");
    }

    @Override
    public void serve() {
        System.out.println("Serving beverage: " + name + " in appropriate glassware");
    }
}

// Question 5: Shape manipulation with polymorphism
interface TransformableShape {
    void resize(double factor);
    void rotate(double degrees);
}

class ResizableCircle implements TransformableShape {
    private double radius;

    public ResizableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized to radius: " + radius);
    }

    @Override
    public void rotate(double degrees) {
        System.out.println("Circle rotated by " + degrees + " degrees (no visual change)");
    }
}

class ResizableSquare implements TransformableShape {
    private double side;

    public ResizableSquare(double side) {
        this.side = side;
    }

    @Override
    public void resize(double factor) {
        side *= factor;
        System.out.println("Square resized to side length: " + side);
    }

    @Override
    public void rotate(double degrees) {
        System.out.println("Square rotated by " + degrees + " degrees");
    }
}

class ResizableTriangle implements TransformableShape {
    private String type;

    public ResizableTriangle(String type) {
        this.type = type;
    }

    @Override
    public void resize(double factor) {
        System.out.println(type + " triangle resized by factor " + factor);
    }

    @Override
    public void rotate(double degrees) {
        System.out.println(type + " triangle rotated by " + degrees + " degrees");
    }
}

// Question 6: Calculator with method overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Question 7: Geometry with method overloading
class Geometry {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

// Question 8: Payroll system with method overriding
class Employee {
    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double performanceBonus;

    public Manager(double baseSalary, double performanceBonus) {
        super(baseSalary);
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

// Question 9: Banking application with method overriding
class Account {
    protected double balance;
    protected double interestRate;

    public Account(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance, 0.03); // 3% interest rate
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate * 0.75; // 25% tax on savings interest
    }
}

class FixedDepositAccount extends Account {
    public FixedDepositAccount(double balance) {
        super(balance, 0.06); // 6% interest rate
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate * 1.1; // 10% bonus on fixed deposit interest
    }
}

// Question 10: Game character attacks with method overriding
class Character {
    public void attack() {
        System.out.println("Basic attack!");
    }
}

class Warrior extends Character {
    @Override
    public void attack() {
        System.out.println("Warrior swings a mighty sword!");
    }
}

class Mage extends Character {
    @Override
    public void attack() {
        System.out.println("Mage casts a powerful spell!");
    }
}

// Question 11: Music application with polymorphism
interface MusicalInstrument {
    void playSound();
}

class Piano implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Piano sound: Beautiful melodic tones");
    }
}

class Guitar implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Guitar sound: Strumming chords");
    }
}

class Violin implements MusicalInstrument {
    @Override
    public void playSound() {
        System.out.println("Violin sound: Smooth bowing notes");
    }
}

public class PolymorphismTask {
    public static void main(String[] args) {
        // Question 1 demo
        System.out.println("\nQuestion 1: Shape Areas");
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6), new Triangle(3, 7)};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

        // Question 2 demo
        System.out.println("\nQuestion 2: Payment Processing");
        PaymentMethod[] payments = {
            new CreditCard("1234567812345678", "12/25"),
            new PayPal("user@example.com"),
            new BankTransfer("12345678")
        };
        for (PaymentMethod payment : payments) {
            if (payment.validate()) {
                payment.processPayment(100.0);
            }
        }

        // Question 3 demo
        System.out.println("\nQuestion 3: Rental Costs");
        Vehicle[] vehicles = {new Car(5), new Motorcycle(3), new Bicycle(10)};
        for (Vehicle vehicle : vehicles) {
            System.out.println("Rental cost: $" + vehicle.calculateRentalCost());
        }

        // Question 4 demo
        System.out.println("\nQuestion 4: Restaurant Order");
        MenuItem[] order = {
            new Appetizer("Bruschetta", 8.99),
            new MainCourse("Steak", 24.99),
            new Beverage("Wine", 7.99)
        };
        for (MenuItem item : order) {
            item.prepare();
            item.serve();
        }

        // Question 5 demo
        System.out.println("\nQuestion 5: Shape Manipulation");
        TransformableShape[] transformableShapes = {
            new ResizableCircle(5),
            new ResizableSquare(4),
            new ResizableTriangle("Equilateral")
        };
        for (TransformableShape shape : transformableShapes) {
            shape.resize(1.5);
            shape.rotate(45);
        }

        // Question 6 demo
        System.out.println("\nQuestion 6: Calculator Overloading");
        Calculator calc = new Calculator();
        System.out.println("2 ints: " + calc.add(2, 3));
        System.out.println("2 doubles: " + calc.add(2.5, 3.7));
        System.out.println("3 ints: " + calc.add(2, 3, 4));

        // Question 7 demo
        System.out.println("\nQuestion 7: Geometry Overloading");
        Geometry geo = new Geometry();
        System.out.println("Circle area: " + geo.calculateArea(5.0));
        System.out.println("Rectangle area: " + geo.calculateArea(4.0, 6.0));
        System.out.println("Triangle area: " + geo.calculateArea(3.0, 7.0, true));

        // Question 8 demo
        System.out.println("\nQuestion 8: Payroll Overriding");
        Employee emp = new Employee(50000);
        Manager mgr = new Manager(70000, 10000);
        System.out.println("Employee salary: " + emp.calculateSalary());
        System.out.println("Manager salary: " + mgr.calculateSalary());

        // Question 9 demo
        System.out.println("\nQuestion 9: Banking Overriding");
        Account[] accounts = {
            new Account(1000, 0.05),
            new SavingsAccount(1000),
            new FixedDepositAccount(1000)
        };
        for (Account acc : accounts) {
            System.out.println("Interest: " + acc.calculateInterest());
        }

        // Question 10 demo
        System.out.println("\nQuestion 10: Character Attacks");
        Character[] characters = {new Character(), new Warrior(), new Mage()};
        for (Character character : characters) {
            character.attack();
        }

        // Question 11 demo
        System.out.println("\nQuestion 11: Musical Instruments");
        MusicalInstrument[] instruments = {new Piano(), new Guitar(), new Violin()};
        for (MusicalInstrument instrument : instruments) {
            instrument.playSound();
        }
    }
}