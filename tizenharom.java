import java.util.Scanner;

public class tizenharom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double szam = Math.random() *100 +1;
        int szamocska = (int) szam;
        boolean kitalalt = false;

        while   (kitalalt==false)
        {
            System.out.println("Tippelj!");
            int alma = sc.nextInt();
            if (alma==szamocska)
            {
                kitalalt = true;
                System.out.println("Grat!");

            }
            else if (alma < szamocska)
            {

                System.out.println("A gondolt szam nagyobb.");


            }
            else {
                System.out.println("A gondol szam kisebb.");
            }



        }





    }


}
