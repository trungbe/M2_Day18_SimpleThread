public class NumberGenerator implements Runnable {

    int number;

    public NumberGenerator(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(this.number);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        Thread thread = new Thread();
        System.out.println(thread.hashCode());
    }
}
