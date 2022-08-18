import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("kaç sayı istediğinizi giriniz : ");
        Scanner inp =new Scanner(System.in);
        StringBuilder Seri= new StringBuilder("0 1 ");
        int n=inp.nextInt();
        int n0=0;
        int n1=1;
        int n2;
        for (int i=2;i<=n;i++){
            n2=n1+n0;
            n0=n1;
            n1=n2;
            Seri.append(n1).append(" ");

        }
        System.out.println(Seri);
    }
}
