public class Potrebitel implements Runnable {

    private final Buffer buffer;

    public Potrebitel(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int n=0;
        try {
            while (n<30) {

                buffer.consume();
                Thread.sleep(1500);
                n+=1;
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}