package Queuei;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);

        System.out.println("queue" + queue);
        System.out.println("dqueued:" + queue.dequeue(3));
        System.out.println("queue" + queue);
        System.out.println("size: " + queue.size());

    }




}
