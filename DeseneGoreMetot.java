import java.util.Scanner;

public class DeseneGoreMetot {
    static void desen(int n) {
        int count = 0;
        do {
            n -= 5;
            System.out.print(n + " ");
            count++;
        } while (0 < n);
        for (int i = 1; i <= count; i++) {
            n += 5;
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        desen(a);

    }
}
