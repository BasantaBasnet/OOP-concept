/*1. Write a Java program to create a class called "Circle" with a radius attribute.
 You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.
public class Circle {
    private double radius;

  
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.0);
        
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}

2. Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, 
using setter getter method and print the values.
public class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    // Setters
    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

   
    public double getPrinciple() {
        return principle;
    }

    public double getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }

    public double calculateInterest() {
        return (principle * time * rate) / 100;
    }

    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(1000);
        si.setTime(2);
        si.setRate(5);
        
        System.out.println("Principle: " + si.getPrinciple());
        System.out.println("Time: " + si.getTime());
        System.out.println("Rate: " + si.getRate());
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}


3. Write a Java program to create a class called "Dog" with a name and breed attribute.
 Create two instances of the "Dog" class, set their attributes using the constructor and 
 modify the attributes using the setter methods and print the updated values.

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");
        
        System.out.println("Initial values:");
        System.out.println("Dog1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Dog2: " + dog2.getName() + ", " + dog2.getBreed());
        
        dog1.setName("Rocky");
        dog2.setBreed("Labrador");
        
        System.out.println("\nUpdated values:");
        System.out.println("Dog1: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("Dog2: " + dog2.getName() + ", " + dog2.getBreed());
    }
}


4. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and 
methods to calculate and update salary.

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 5000);
        
        System.out.println("Initial Salary: " + emp.getSalary());
        emp.updateSalary(10); // 10% raise
        System.out.println("Updated Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
    }
}



ENCAPSULATION

1. You are developing an e-commerce application and need to implement a Product class. 
The Product class should have private instance variables for the product name, product ID, and price.
 Implement getter and setter methods for these variables, ensuring that the price cannot be negative. 
 Additionally, include a private variable to track the stock quantity and provide public methods to update 
 the stock when a product is purchased or restocked.

public class Product {
    private String name;
    private String productId;
    private double price;
    private int stockQuantity;


    public Product(String name, String productId, double price, int stockQuantity) {
        this.name = name;
        this.productId = productId;
        setPrice(price);
        this.stockQuantity = stockQuantity;
    }

 
    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative. Setting to 0.");
            this.price = 0;
        }
    }

    
    public void purchase(int quantity) {
        if (quantity > 0 && stockQuantity >= quantity) {
            stockQuantity -= quantity;
        } else {
            System.out.println("Invalid purchase quantity or insufficient stock.");
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }
}




2. You are building a banking application that has a BankAccount class. 
Implement the BankAccount class with encapsulation principles in mind. 
Include private instance variables for the account number, account holder name, and account balance. 
Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance. 
Ensure that the account balance cannot be accessed or modified directly.

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

   
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}


3. You are developing a library management system and need to implement a Book class. 
The Book class should have private instance variables for the book title, author name, and publication year. 
Implement appropriate getter and setter methods to ensure encapsulation. Additionally, 
include a private variable to track the availability of the book (e.g., true if available, false if borrowed), 
and provide a public method to borrow the book, updating its availability status.

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

  
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

 
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

   
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

  
    public void returnBook() {
        isAvailable = true;
    }
}


4. You are working on a student information system and need to create a Student class. 
The student class should have private instance variables for the student's name, ID number, and grade point average (GPA). 
Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only
 through these methods. However, the GPA should be read-only and can only be set within the class constructor.

public class Student {
    private String name;
    private String idNumber;
    private final double gpa;

   
    public Student(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

   
    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

  
}


5. You are building an employee management system and need to create an Employee  class. 
The Employee class should have private instance variables for the employee name, employee ID, and salary. 
Implement getter and setter methods for the name and ID, but ensure that the salary can only be updated through a 
specific method that increases or decreases the amount while preventing negative values.

public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

   
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Special method to update salary
    public void adjustSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        } else {
            System.out.println("Salary adjustment would result in negative value. Adjustment not made.");
        }
    }
}



6. You are designing a car rental system, and you need to create a Car class. 
The Car class should have private instance variables for the car's make, model, and rental price per day. 
Implement appropriate getter and setter methods for these variables, 
ensuring that the make and model can only be set once during object creation. 
Additionally, include a private variable to track the availability of the car (e.g., true if available for rent, false if rented), 
and provide public methods to rent and return the car, updating its availability status.

public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

   
    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
        this.isAvailable = true;
    }

   
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay > 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price must be positive.");
        }
    }

    public boolean rentCar() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    
    public void returnCar() {
        isAvailable = true;
    }
}

*/