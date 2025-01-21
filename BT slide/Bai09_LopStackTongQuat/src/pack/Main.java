package pack;

public class Main {
    public static void main(String[] args) {
        StackOfChars charStack = new StackOfChars(5);
        charStack.push('A');
        charStack.push('B');
        System.out.println("Top of char stack: " + charStack.peak());
        System.out.println("Popped from char stack: " + charStack.pop());
        System.out.println("Is char stack empty? " + charStack.isEmpty());

        StackOfIntegers intStack = new StackOfIntegers(5);
        intStack.push(10);
        intStack.push(20);
        System.out.println("Top of int stack: " + intStack.peak());
        System.out.println("Popped from int stack: " + intStack.pop());
        System.out.println("Is int stack empty? " + intStack.isEmpty());
    }
}