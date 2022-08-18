import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2,i;
        boolean a = false;
        do {
            System.out.println("n1 sayısını giriniz : ");
            n1 = inp.nextInt();
            System.out.println("n2 sayısını giriniz : ");
            n2 = inp.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("pozitif sayılar giriniz");

            } else {
                a = true;
            }
        } while (!a);
        i = Math.min(n2, n1);

        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("ebob : " + i);
                break;
            } else {
                i--;
            }
        }
        int j = n2;

        while (j <= (n1 * n2)) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                System.out.println("ekok : " + j);
                break;
            } else {
                j++;
            }
        }

    }
}

