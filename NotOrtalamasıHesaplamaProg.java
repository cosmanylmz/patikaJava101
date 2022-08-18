import java.util.Scanner;

public class NotOrtalamasıHesaplamaProg {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, türkçe, müzik;

        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat=inp.nextInt();

        System.out.print("fizik notunuz: ");
        fizik=inp.nextInt();

        System.out.print("kimya notunuz: ");
        kimya=inp.nextInt();

        System.out.print("müzik notunuz: ");
        müzik=inp.nextInt();

        System.out.print("tarih notunuz: ");
        tarih=inp.nextInt();

        System.out.print("türkçe notunuz: ");
        türkçe=inp.nextInt();
        int toplam= mat + fizik + kimya + türkçe + tarih + müzik;
        double sonuç=toplam/6;
        if (sonuç >60){
            System.out.println("sınıfı geçti");
        }
        else System.out.println("sınıfta kaldı");
    }
}
