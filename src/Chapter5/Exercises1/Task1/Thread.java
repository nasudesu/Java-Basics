package Chapter5.Exercises1.Task1;

public class Thread extends java.lang.Thread {
    private int num;
    Thread(int num){
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (this.num % 2 == 0){
                System.out.println("Even Thread: "+num);
            } else {
                System.out.println("Odd Thread: "+num);
            }
            num += 2;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread Thread1 = new Thread(1);
        Thread Thread2 = new Thread(2);

        Thread2.start();
        Thread2.join();
        Thread1.start();
    }
}
