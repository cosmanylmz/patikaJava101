import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Bir sayı giriniz");
        Scanner inp=new Scanner(System.in);
        int sayi=inp.nextInt();
        int total=0;
    for (int i=1;i<sayi;i++){
        if (sayi%i==0){
            total+=i;
        }
    }
    if (total==sayi){
        System.out.println(sayi+" mükemmel bir sayıdır");
    }else System.out.println(sayi+" mükemmel sayı değildir");
    }
}
