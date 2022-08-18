import java.util.Scanner;

public class SumUpOddProject {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k ;
        int toplam=0;
        do {
            System.out.println("lütfen sayıyı giriniz");
            k =inp.nextInt();
            if (k % 4 == 0 && k % 2 == 0){
               toplam +=k;
            }
        }while(k%2==0);
        System.out.println(toplam);
    }
}
