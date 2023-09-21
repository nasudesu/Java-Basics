package Testikansio;

import java.util.Scanner;

public class Timer extends Thread {
    private final double seconds;
    boolean continues = true;

    public Timer(double timer){
        this.seconds = timer;
    }

    public void run() {
        while (continues){
            try {
                Thread.sleep((long) (seconds * 1000));
                System.out.println("Aikaa meni " + seconds + " verran");
            } catch (InterruptedException e){
                System.out.println("Lopetetaan");
                return;
            }
        }
    }


    public static void main(String[] args) {
        Timer timer1 = new Timer(2);
        Timer timer2 = new Timer(3);
        timer1.run();
        timer2.run();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Paina enter lopettaaksee");
        scanner.nextLine();
        System.out.println("Lopetetaan...");
        //timer1.interrupt();
        //timer2.interrupt();

    }
}
