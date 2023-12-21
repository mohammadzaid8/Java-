// write a program to implement a stack using class

import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<Integer>();
    }

    public void push(int value) {
        stack.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int result = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return result;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class Ex15_Stack_using_class {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        // Add elements to the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Remove and print elements from the stack
        System.out.println(myStack.pop());  // 30
        System.out.println(myStack.pop());  // 20
        System.out.println(myStack.pop());  // 10

        // Try to remove an element from an empty stack
        System.out.println(myStack.pop());  // Stack is empty!

        // Add some more elements and peek at the top element
        myStack.push(40);
        myStack.push(50);
        System.out.println(myStack.peek());  // 50
    }
}






