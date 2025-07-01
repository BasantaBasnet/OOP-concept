// 1. As a software developer, you have been assigned a task to implement a stack data structure in Java.
//  Your goal is to create a Java class named Stack.java that represents a stack using a array. Implement the following operations:
// push(int element): Adds an integer value element to the top of the stack.
// pop(): Removes and returns the element at the top of the stack.
// peek(): Returns the element at the top of the stack without removing it.
// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.
// size(): Returns the number of elements currently in the stack.
// Your task is to write the Stack.java class and provide the necessary implementation for these operations using a array as the underlying data structure. Ensure that the stack follows the last-in, first-out (LIFO) principle.

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}






// 2. You are tasked with implementing a stack data structure in Java without using any built-in libraries. 
// Your goal is to create a CustomStack class that can handle various operations. The class should have the following functionalities:
// push(int val): Adds an integer value val to the top of the stack.
// pop(): Removes and returns the element at the top of the stack.
// peek(): Returns the element at the top of the stack without removing it.
// isEmpty(): Checks if the stack is empty and returns a boolean value indicating the result.
// isFull(): Checks if the stack is full and returns a boolean value indicating the result.

public class CustomStack {
    private int[] arr;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        arr[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}


// 3. Design a program that simulates a supermarket queue management system using an array-based implementation of a queue.
//  The system should allow customers to join the queue, get served, and exit the queue. Implement the following functionalities:
// a. Add a customer to the queue.
// b. Serve the next customer in the queue.
// c. Display the current queue.
// d. Display the number of customers in the queue.
// e. Exit the program

public class SupermarketQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public SupermarketQueue(int size) {
        capacity = size;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCustomer(String customer) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = customer;
        size++;
    }

    public String serveCustomer() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        String customer = queue[front];
        front = (front + 1) % capacity;
        size--;
        return customer;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Current queue:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.println((i + 1) + ". " + queue[index]);
        }
    }

    public int getQueueSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}



// 4. Implement a call center queue using an array-based implementation of a queue. 
// The program should allow call center agents to handle incoming calls in a fair manner. Implement the following functionalities:
// a. Add an incoming call to the queue.
// b. Serve and handle the next call in the queue.
// c. Display the current call queue.
// d. Display the number of pending calls.
// e. Exit the program.
// Submission Status

public class CallCenterQueue {
    private String[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public CallCenterQueue(int size) {
        capacity = size;
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void addCall(String call) {
        if (isFull()) {
            throw new RuntimeException("Call queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = call;
        size++;
    }

    public String handleCall() {
        if (isEmpty()) {
            throw new RuntimeException("No calls in queue");
        }
        String call = queue[front];
        front = (front + 1) % capacity;
        size--;
        return call;
    }

    public void displayCallQueue() {
        if (isEmpty()) {
            System.out.println("No pending calls");
            return;
        }
        System.out.println("Current call queue:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.println((i + 1) + ". " + queue[index]);
        }
    }

    public int getPendingCalls() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}