import java.util.Scanner;

public class hatodikfeladat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Adja meg a pontszámot: ");
        double pontszam = sc.nextDouble();

        if (pontszam < 43) {
            System.out.println("Elégtelen");


        } else if (pontszam < 58) {
            System.out.println("Elégséges");


        } else if (pontszam < 73) {
            System.out.println("Közepes");


        } else if (pontszam < 88) {
            System.out.println("Jó");


        } else {
            System.out.println("Jeles");
        }


    }


}
