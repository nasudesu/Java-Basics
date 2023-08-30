package Ohjemistoprojekti2;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> group1 = new ArrayList<Integer>();
        ArrayList<Integer> group2 = new ArrayList<Integer>();
        ArrayList<Integer> group3 = new ArrayList<Integer>();
        ArrayList<Integer> group4 = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            int ran = random.nextInt(100)+1;
            if (ran < 40) {
                group1.add(ran);
            } else if (ran > 40 && ran <= 70) {
                group2.add(ran);
            } else if (ran > 70 && ran <= 90) {
                group3.add(ran);
            } else if (ran > 90) {
                group4.add(ran);
            }
            //System.out.println(ran);
        }
        System.out.println("Group1"+group1);
        System.out.println(group1.size());

    }
}
