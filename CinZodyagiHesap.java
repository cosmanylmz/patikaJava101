import java.util.Scanner;

public class CinZodyagiHesap {
    public static void main(String[] args) {
        System.out.println("Lütfen doğum yılınız giriniz: ");

        Scanner inp=new Scanner(System.in);
        int yıl=inp.nextInt();
        System.out.println("çin zodyağı burcunuz  : ");
        int a=yıl%12;

        switch (a){
            case 0:
                System.out.println("maymun");
                break;
            case 1:
                System.out.println("horoz");
                break;
            case 2:
                System.out.println("köpek");
                break;
            case 3:
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("fare");
                break;
            case 5:
                System.out.println("öküz");
                break;
            case 6:
                System.out.println("kaplan");
                break;
            case 7:
                System.out.println("tavşan");
                break;
            case 8:
                System.out.println("ejderha");
                break;
            case 9:
                System.out.println("yılan");
                break;
            case 10:
                System.out.println("at");
                break;
            case 11:
                System.out.println("koyun");
                break;
        }

    }
}
