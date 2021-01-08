public class Main {
    public static void main(String[] args)  {
        int maxPriority = Thread.MAX_PRIORITY;
        int minPriority = Thread.MIN_PRIORITY;
        NumberGenerator numberGenerator1 = new NumberGenerator(minPriority);
        NumberGenerator numberGenerator2 = new NumberGenerator(maxPriority);

        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);

        thread1.start();
        thread2.start();
    }
}
