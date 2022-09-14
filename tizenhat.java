package hu.petrik.javabevezeto;

import java.util.Scanner;

public class tizenhat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] tomb = new int[5];
        for (int i = 0; i <tomb.length ; i++) {
            System.out.print("Adjon meg egy számot: ");
            tomb[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("A tömb elemei a megadás sorrendjében:");
        for (int i = 0; i <tomb.length ; i++) {
            System.out.print(tomb[i]);

        }
        System.out.println();
        System.out.println("A tömb elemei fordított sorrendben:");
        for (int i = 4; i >-1 ; i--) {
            System.out.print(tomb[i]);

        }

        System.out.println("A tömb minden második eleme:");
        for (int i = 1; i <tomb.length ; i+=2) {
            System.out.print(tomb[i]);

        }

        System.out.print("Adjon meg egy számot: ");
        int alma = sc.nextInt();
        sc.nextLine();

        System.out.println(tomb[alma-1]);


    }



}
