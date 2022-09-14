package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adjon meg egy magasságot: ");
        double magassag = sc.nextDouble();
        System.out.println("Adjon meg egy szélességet: ");
        double szelesseg = sc.nextDouble();

        double alapmeret = 0.2 * 0.2;

        double szukseg =Math.round((magassag * szelesseg / alapmeret *1.1));
        System.out.printf("%.0f csempére van szükség", szukseg);



    }



}
