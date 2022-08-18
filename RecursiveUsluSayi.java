import java.util.Scanner;

public class RecursiveUsluSayi {
    static void usAlma(int n,int k){
       int toplam=1;

       for (int i=1;i<=k;i++){
           toplam*=n;
       }
       System.out.println("sonuç : "+toplam);
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("taban sayisini giriniz : ");
        int a =inp.nextInt();
        System.out.println("us sayısını giriniz : ");
        int b =inp.nextInt();
        usAlma(a,b);
    }
}
