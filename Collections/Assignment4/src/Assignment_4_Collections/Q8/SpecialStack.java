package Assignment_4_Collections.Q8;

import java.util.Stack;
class SpecialStack {
private int array[];
private static int top;
private int capacity;
        int currentMinimumElement;

public SpecialStack(int size) {
        array = new int[size];
        capacity = size;
        top =-1;
        }
static boolean isEmpty() {
        if (top == -1) {
        System.out.println("SpecialStack is empty");
        return true;
        }
        return false;
        }
        void isFull() {
        if (top == capacity - 1) {
        System.out.println("SpecialStack is full");
        }
        }
        void getMin() {
        if (isEmpty()) {
        System.out.println("SpecialStack is empty");
        } else {
        System.out.println("Current Min element is " + currentMinimumElement);
        }
        }
        void pop() {
        if (isEmpty()) {
        System.out.println("SpecialStack is empty");
        return;
        }
        System.out.print("Top element popped ");
        int top1 = array[top--];

        if (top1 < currentMinimumElement) {
        System.out.println(currentMinimumElement);
        currentMinimumElement = currentMinimumElement*2 -top1;
        }
        else {
        System.out.print(top1);
        }
        }

        void push(int element) {
        if (isEmpty()) {
        currentMinimumElement = element;
        array[++top] = element;
        System.out.println(element + " is inserted");
        return;
        }
        if (element < currentMinimumElement) {
        array[++top] = 2*element - currentMinimumElement;
        currentMinimumElement = element;
        }
        else {
        array[++top] = element;
        }
        System.out.println(element + " is inserted");
        }


        public static void main(String[] args) {
        SpecialStack s = new SpecialStack(5);
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        s.pop();
        s.getMin();
    }
}


