public class Consumer extends Thread {

    private Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try{
            while(true){
                int value = buffer.get();
                System.out.println("Consumed" + ":" + value);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
