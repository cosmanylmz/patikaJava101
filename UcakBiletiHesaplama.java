import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("km cinsiden mesafeyi giriniz:");
        double mesafe =inp.nextInt();
        if (mesafe <0){
            System.out.println("hatalı kod girdiniz");
            System.exit(0);
        }
        System.out.println("yaşınızı giriniz :");
        int yas=inp.nextInt();

        double yaşIndirimiOranı=0;
        if (yas<0){
            System.out.println("hatalı kod girdiniz");
            System.exit(0);
        }
        else if (yas<12){
            yaşIndirimiOranı=0.5;
        }
        else if ( yas<24 && 12<=yas){
            yaşIndirimiOranı=0.1;
        }
        else if (yas>65){
            yaşIndirimiOranı=0.3;
        }

        System.out.println("yolculuk tipi seçiniz 1 ve 2 ");
        int yolculukTipi=inp.nextInt();
        double tipIndirimOranı=0;

        if(yolculukTipi==2){
            tipIndirimOranı=0.20;
        }
        else if (yolculukTipi==1){
            tipIndirimOranı=0;
        }
        else if (!(yolculukTipi==1 ||yolculukTipi==2 )){
            System.out.println("hatalı code girdiniz");
            System.exit(0);
        }
       double normalTutar =mesafe*0.10;
       double yasIndirimliTutar=normalTutar-(normalTutar*yaşIndirimiOranı);
       double toplamTutar=yasIndirimliTutar-(yasIndirimliTutar*tipIndirimOranı);

        System.out.println("Toplam tutar : "+toplamTutar);





    }
}
