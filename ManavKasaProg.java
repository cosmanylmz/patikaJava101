import java.util.Scanner;

public class ManavKasaProg {
    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlıcan=5.00;
        Scanner inp= new Scanner(System.in);
        System.out.println("Armut kaç kilo : ");
        double armutKg=inp.nextDouble();
        System.out.println("Elma kaç kilo : ");
        double elmaKg=inp.nextDouble();
        System.out.println("Domates kaç kilo  : ");
        double domatesKg=inp.nextDouble();
        System.out.println("Muz  kaç kilo  : ");
        double muzKg=inp.nextDouble();
        System.out.println("Patlıcan kaç kilo: ");
        double patlıcanKg=inp.nextDouble();

        double tutar = armut*armutKg+elma*elmaKg+domates*domatesKg+muz*muzKg+patlıcan*patlıcanKg;
        System.out.println("Toplam tutarınız : "+tutar);
    }
}
