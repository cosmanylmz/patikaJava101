import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        System.out.println("mesafeyi km cinsinde giriniz: ");
        Scanner inp=new Scanner(System.in);
        int km=inp.nextInt();
        double payment;
        payment=km*(2.20)+10;
        if (payment<20){
            payment=20;
        }
        System.out.println("payment ="+payment);
    }
}
