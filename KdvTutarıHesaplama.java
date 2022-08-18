import java.util.Scanner;

public class KdvTutarıHesaplama {
    public static void main(String[] args) {
        int money;
        double kdv;
        Scanner inp=new Scanner(System.in);
        System.out.println("Money amount");
        money=inp.nextInt();

        if(money>1000){
            kdv=8;
            System.out.println("KDV'siz Fiyat : "+money);
            System.out.println("KDV'li Fiyat : "+money*kdv/100);
            System.out.println("Kdv tutarı : "+kdv);
    }
        else{ kdv=18;
            System.out.println("KDV'siz Fiyat : "+money);
            System.out.println("KDV'li Fiyat : "+money*kdv/100);
            System.out.println("Kdv tutarı : "+kdv);}

}
}
