package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat8 {


    public static void main(String[] args) {
        System.out.println("Kérem adja meg a tippjét (0 - fej || 1 - írás)");
        Scanner sc = new Scanner(System.in);
        int tipp = sc.nextInt();
        int feldobas =(int) (Math.random() * 2);
        System.out.printf("A dobás eredménye %s", (feldobas ==0) ? "fej" : "írás");

        if (tipp == feldobas)
        {
            System.out.println("Gratula, nyert!");
        }
        else
        {
            System.out.println("Sajnos nem nyert, próbálja újra");
        }
    }
}
