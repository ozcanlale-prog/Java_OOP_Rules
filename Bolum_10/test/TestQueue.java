public class TestQueue {
public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i * 10);
        }

        System.out.println("Kuyruk boyutu: " + queue.getSize());

        System.out.print("Kuyruktan çıkarılan elemanlar: ");
        while (!queue.empty()) {
            System.out.print(queue.dequeue() + " ");
        }
        
        System.out.println("\nSon kuyruk boyutu: " + queue.getSize());
    }    
}
