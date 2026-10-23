public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
        size = 0;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (empty()) {
            throw new IllegalStateException("Kuyruk boş!");
        }
        
        int v = elements[0];
        
        // Kalan elemanları bir sola kaydır (FIFO mantığı için)
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        
        size--;
        return v;
    }

    // Kuyruk boş mu kontrol eder
    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    
}