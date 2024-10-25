public class Consumer extends Thread {

    private Buffer buffer;
    private int id;

    public Consumer(Buffer buffer, int id) {
        this.buffer = buffer;
        this.id = id;
    }

    public void run() {
        try{
            while(true){
                int value = buffer.get();
                System.out.println("Consumer:" + id +  " Consumed:" + value);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
