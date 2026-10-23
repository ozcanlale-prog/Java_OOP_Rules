package bolum_10;

public class DisplayPrimesLessThan120 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int n = 2; n < 120; n++) {
            if (isPrime(n)) {
                stack.push(n);
            }
        }

        while (!stack.empty()) {
            System.out.print(stack.pop());
            if (!stack.empty()) {
                System.out.print(", ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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