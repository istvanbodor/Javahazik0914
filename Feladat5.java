package hu.petrik.javabevezeto;

import java.util.Scanner;

public class Feladat5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem adja meg a téglalap 'a' oldalát (cm): ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg a téglalap 'b' oldalát (cm): ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Kérem adja meg , hogy mit szeretne kiszámítani (K: kerület, T: terület): ");
        String muvelet = sc.nextLine();
        if (muvelet.equals("K")) {

            double kerulet = 2 * a + b;
            System.out.printf("A téglalap kerülete: %.2f centiméter", kerulet);

        } else if (muvelet.equals("T")) {
            double terulet = a * b;
            System.out.printf("A téglalap területe: %.2f négyzetcentiméter", terulet);
        } else {
            System.out.println("Hibás műveletet adott meg!");
        }
        if (a == b) {
            System.out.println("A megadott téglalap egy négyzet.");
        }

    }


}
