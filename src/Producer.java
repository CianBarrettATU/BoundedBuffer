public class Producer extends Thread {

    private Buffer buffer;
    private int id;

    public Producer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    public void run() {
        int value = 0;
        try {
            while (true) {
                buffer.put(value);
                System.out.println("Producer:" + id + " Produced: " + value);
                value++;
                //Different results when timing is different on each thread
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
