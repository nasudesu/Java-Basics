package Chapter5.Exercises1.Task2;


import java.util.Random;

public class ThreadCal extends Thread {
    private int num1;
    private int num2;
    private static int threadnum = 0;
    private int thread;
    public ThreadCal(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.thread = ++threadnum;
    }
    @Override
    public void run() {
        System.out.println("Thread #"+thread+" Summing: "+num1+" + "+num2+" = "+(num1+num2));
    }
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        ThreadCal[] threadCals = new ThreadCal[10];
        for (int i = 0; i < threadCals.length; i++) {
            threadCals[i] = new ThreadCal(random.nextInt(10)+1,random.nextInt(10)+1);
            threadCals[i].start();

            threadCals[i].join(); //Jos haluaa tulostaa järjestyksessä
        }
    }
}
