import java.util.Scanner;
public class DaireninAlanıVeÇevresi {
    public static void main(String[] args) {
        int r ,x;
        double pi=3.14;
        System.out.println("yarıçapı giriniz: ");
        Scanner inp=new Scanner(System.in);
        r=inp.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;
        x=inp.nextInt();
        double DaireDilimiAlanı=(pi * (r*r) * x) / 360;
        System.out.println(DaireDilimiAlanı);


    }
}
