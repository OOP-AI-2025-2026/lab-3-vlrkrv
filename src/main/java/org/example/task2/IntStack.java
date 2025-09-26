package org.example.task2;

public class IntStack {
    private static final int INITIAL_CAPACITY = 30;

    private final int[] stackArray;
    private int top;

    public IntStack() {
        this.stackArray = new int[INITIAL_CAPACITY];
        this.top = -1;
    }

    public void push(final int value) {
        if (top == stackArray.length - 1) {
        return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            return 0;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            return 0;
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        top = -1;
    }
}
