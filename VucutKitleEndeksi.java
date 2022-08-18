import java.util.Scanner;

public class VucutKitleEndeksi
{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("kilo giriniz");
        double kilo=inp.nextDouble();
        System.out.println("boy giriniz(metre cinsinden)");
        double boy=inp.nextDouble();
        double VucutkitleEndeks= kilo/(boy*boy);
        System.out.println("vucut kütle endeksi= " +VucutkitleEndeks);
    }
}
