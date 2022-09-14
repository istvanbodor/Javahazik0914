package hu.petrik.javabevezeto;

public class tizenhet {


    static int[] osszead(int[] a, int[] b) {
        int alma = 0;
        if (a.length > b.length) {
            alma = a.length;

        } else {
            alma = b.length;
        }

        int[] c = new int[alma];
        for (int i = 0; i <alma; i++) {
            c[i] = a[i] + b[i];
        }


        return  c;
    }

    public static void main(String[] args) {


    }


}
