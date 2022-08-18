import java.util.Scanner;

public class AsalSayiBulma {
    public static void main(String[] args) {
//total olayı sadece iki tane çarpanı l-olduğunu teyit etmemiz için eğer sadece iki çarpanı varsa asaldır.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        String AsalSayilar=" ";
        for ( int i = 1; i<=n ; i++) {
            int total = 0;
            for (int k = i; k >= 1; k--) {
                if (i % k == 0) {
                    total++;
                }
            }

            if (total == 2) {
            AsalSayilar=AsalSayilar+i+" ";
            }
        }
        System.out.println(AsalSayilar);
    }
}
