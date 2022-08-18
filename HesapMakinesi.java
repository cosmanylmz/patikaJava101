import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz");
        int i1=inp.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int i2=inp.nextInt();
        System.out.println("yapmak istediğiniz işlemi seçinizi\n 0-toplama\n 1-cikarma \n 2-carpma \n 3-bölme");
        int choise=inp.nextInt();
        switch (choise){

            case 0:
                System.out.println("Toplam : "+(i1+i2));
                break;
            case 1:
                System.out.println("Cikartma : "+(i1-i2));
                break;
            case 2:
                System.out.println("Carpma : "+(i1*i2));
                break;
            case 3:
                if (i2==0){
                    System.out.println("wrong statement");
                }
                else System.out.println("Bölme : "+(i1/i2));


                break;
        }
    }
}
