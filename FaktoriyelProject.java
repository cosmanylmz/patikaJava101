import java.util.Scanner;

public class FaktoriyelProject {
    public static void main(String[] args) {
        System.out.println("n sayısını giriniz  : ");
        Scanner inp =new Scanner(System.in);
        int  n=inp.nextInt();
        System.out.println("r sayısını giriniz  : ");
        int r=inp.nextInt();
        int toplamN=1;
        int toplamR=1;
        int toplamD=1;
        int d=n-r;

        for (int i=1;i<=n;i++){
             toplamN =toplamN*i;
        }
        for (int i=1;i<=r;i++){
            toplamR =toplamR*i;
        }
        for (int i=1;i<=d;i++){
            toplamD =toplamD*i;
        }
  int combination=toplamN/(toplamR*toplamD);
        System.out.println("C(n,r) is = "+combination);
    }


}
