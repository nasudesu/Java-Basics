package Ohjelmistoprojekti2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> group1 = new ArrayList<>(); //40% jakautuma
        ArrayList<Integer> group2 = new ArrayList<>(); //30% jakautuma
        ArrayList<Integer> group3 = new ArrayList<>(); //20% jakautuma
        ArrayList<Integer> group4 = new ArrayList<>(); //10% jakautuma

        for (int i = 0; i < 1000; i++) {
            int ran = random.nextInt(18, 40)+1;
            if (ran < 26.8) {
                group1.add(ran);
                System.out.println(ran);
            } else if (ran > 26.8 && ran <= 33.4) {
                group2.add(ran);
            } else if (ran > 33.4 && ran <= 37.8) {
                group3.add(ran);
            } else if (ran > 37.8) {
                group4.add(ran);
            }
        }
        System.out.println("Group1"+group1);
        System.out.println("Group2"+group2);
        System.out.println("Group3"+group3);
        System.out.println("Group4"+group4);

    }
}
