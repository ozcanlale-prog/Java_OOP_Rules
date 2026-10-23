package bolum_10;

import java.util.Scanner;

public class DisplayPrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir pozitif tamsayi girin: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;
        while (number > 1) {
            if (number % factor == 0) {
                stack.push(factor);
                number /= factor;
            } else {
                factor++;
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
            if (!stack.empty()) {
                System.out.print(", ");
            }
        }
    }
}

class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}