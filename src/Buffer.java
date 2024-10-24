public class Buffer {

    private int in = 0;
    private int out = 0;
    private int size = 0;
    private int CAPACITY = 10;
    public int[] BUFFER = new int[CAPACITY];

    public synchronized void put(int value){
        while (size == CAPACITY){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
            BUFFER[in] = value;
            in =  (in + 1) % BUFFER.length;
            size ++;
            notifyAll();
    }

    public synchronized int get(){
       while (size == 0){
           try {
               wait();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
       int value = BUFFER[out];
       out = (out + 1) % BUFFER.length;

       size--;
       notifyAll();
       return value;

    }
}