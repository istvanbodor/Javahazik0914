import java.util.Scanner;

public class tizenegyedikfeladat {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy szamot: ");
        int szam = sc.nextInt();
        int osszeg = 0;
        for (int i = 0; i < szam; i++) {
            if (i % 2 != 0) {
                osszeg += i;


            }

        }
        System.out.println(osszeg);


    }


}
