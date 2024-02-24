// Generic class Stack
class Stack<T> {
    private T[] array;
    private int top;
    private final int maxSize = 5;

    // Constructor to initialize the stack
    public Stack() {
        array = (T[]) new Object[maxSize];
        top = -1;
    }

    // Method to push an item onto the stack
    public void push(T item) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push more elements.");
        } else {
            array[++top] = item;
        }
    }

    // Method to pop an item from the stack
    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop elements.");
            return null;
        } else {
            return array[top--];
        }
    }
}

// Main class
public class TestStack {
    public static void main(String[] args) {
        // Creating a stack for integers
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);

        System.out.println("Popping integers from the stack:");
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());

        // Creating a stack for double values
        Stack<Double> doubleStack = new Stack<>();
        doubleStack.push(1.5);
        doubleStack.push(2.5);
        doubleStack.push(3.5);
        doubleStack.push(4.5);
        doubleStack.push(5.5);

        System.out.println("\nPopping doubles from the stack:");
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack.pop());
        System.out.println(doubleStack.pop());
    }
}
