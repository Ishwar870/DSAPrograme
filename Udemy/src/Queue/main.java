package Queue;

public class main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(4);
//        System.out.println(newQueue.isEmpty());
        newQueue.enQueue(2);
        newQueue.enQueue(4);
        newQueue.enQueue(6);
        newQueue.enQueue(8);
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.deQueue());
//        System.out.println(newQueue.peek());
        newQueue.delete();
//        System.out.println(newQueue.deQueue());

    }
}
