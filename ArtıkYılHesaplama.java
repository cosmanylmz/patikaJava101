import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        System.out.println("yıl giriniz : ");
        Scanner inp=new Scanner(System.in);
        int yil=inp.nextInt();
        if( yil%100!=0 && yil%4==0){
            System.out.println(yil+" artık bir yıldır");
        } else if (yil%100==0 && yil%400==0) {
            System.out.println(yil+" artık bir yıldır");
        }else System.out.println(yil+" artık bir yıl değildir");
    }
}
