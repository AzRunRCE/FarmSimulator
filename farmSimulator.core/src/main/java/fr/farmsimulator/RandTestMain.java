package fr.farmsimulator;

import java.util.Date;
import java.util.Random;

public class RandTestMain {

    public static void main(String[] args) {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis());
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));

        int randomValue = r.nextInt(2);
        System.out.println(randomValue);

        Date du = new Date();
        du.setMonth(0);
        du.setDate(1);

        Date au = new Date();
        au.setMonth(11);
        au.setDate(31);

        String testdate = String.valueOf(du);
        String testdate2 = String.valueOf(au);
        System.out.println(testdate);
        System.out.println(testdate2);

    }
}
