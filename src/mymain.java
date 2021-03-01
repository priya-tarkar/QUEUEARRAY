public class mymain {
    public static void main(String[] args) {
        que queue=new que(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.traverse();
        System.out.println("-------------------------");
        queue.dequeue();
        queue.traverse();
        System.out.println("--------------------------000");
        queue.enqueue(60);
        queue.dequeue();
        queue.traverse();
    }
}
