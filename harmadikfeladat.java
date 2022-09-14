import java.util.Scanner;

public class harmadikfeladat {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív valós számot: ");
        double szam = sc.nextDouble();
        int intresz = (int) szam;
        double tizedesresz = (szam - intresz);

        if (intresz == szam) {
            System.out.println("A szám a" + (szam - 1) + " és a " + (szam + 1) + " szamok kozt helyezkedik el és egyikhez sincs közelebb.");
            System.out.println("A szám egész része: "+szam);

        } else if (tizedesresz >0.49)
        {
            System.out.println("A szam a "+ Math.floor(szam) + "és a " + Math.ceil(szam) + "szamok kozt helyezkedik el és a " + Math.ceil(szam) +"- hoz van kozelebb.");
            System.out.println("A szam egesz resze: "+intresz);
            System.out.println("A szam tizedes resze: "+tizedesresz);

        }
        else{


            System.out.println("A szam a "+ Math.floor(szam) + "és a " + Math.ceil(szam) + "szamok kozt helyezkedik el és a " + Math.floor(szam) +"- hoz van kozelebb.");
            System.out.println("A szam egesz resze: "+intresz);
            System.out.println("A szam tizedes resze: "+tizedesresz);

        }


    }


}
