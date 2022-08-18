import java.util.Scanner;

public class UsAlmaDongusu {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("sayı :  ");
        int n=inp.nextInt();
        System.out.println("üssü :  ");
        int k=inp.nextInt();
        int toplam=1;

        for (int i=1;i<=k;i++){
            toplam*=n;
        }
        System.out.println("sonuç : "+toplam);
    }
}
