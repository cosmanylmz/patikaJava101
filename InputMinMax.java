import java.util.Scanner;

public class InputMinMax {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("kaç sayı gireceksiniz : ");
        int n=inp.nextInt();
        System.out.println("birinci sayıyı griniz");
        int n1=inp.nextInt();
        int tempb=n1;
        int tempk=n1;
        do {
            System.out.println("sayıyı giriniz ");
            int n2=inp.nextInt();
            if (tempb<n2){
                tempb=n2;
            }
            if (tempk>n2){
                tempk=n2;
            }
            n--;
        }while(1<=(n-1));

        System.out.println("en büyük sayı : "+tempb+"\n"+"en küçük sayı : "+tempk);
    }
}
