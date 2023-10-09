package Chapter5.Exercises2.Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Arraylistclass arraylistclass = new Arraylistclass();

        ThreadSafe threadSafe1 = new ThreadSafe(arraylistclass);
        ThreadSafe threadSafe2 = new ThreadSafe(arraylistclass);
        ThreadSafe threadSafe3 = new ThreadSafe(arraylistclass);

        threadSafe1.start();
        threadSafe2.start();
        threadSafe3.start();

        threadSafe1.join();
        threadSafe2.join();
        threadSafe3.join();

        threadSafe1.getListSize();
        threadSafe2.getListSize();
        threadSafe3.getListSize();

    }
}
