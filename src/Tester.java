public class Tester {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer, 1);
        producer.start();
        Producer producer2 = new Producer(buffer, 2);
        producer2.start();


        Consumer consumer = new Consumer(buffer, 1);
        consumer.start();
        Consumer consumer2 = new Consumer(buffer, 2);
        consumer2.start();

        Producer producer3 = new Producer(buffer, 3);
        producer3.start();

        Consumer consumer3 = new Consumer(buffer, 3);
        consumer3.start();

    }
}
