public class Tester {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer producer = new Producer(buffer);
        producer.start();
        Producer producer2 = new Producer(buffer);
        producer2.start();
        Consumer consumer = new Consumer(buffer);
        consumer.start();


        Consumer consumer2 = new Consumer(buffer);
        consumer2.start();

    }
}
