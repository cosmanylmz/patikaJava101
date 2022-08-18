import java.util.Scanner;

public class PowersOfTwoLoop {
    public static void main(String[] args) {
        System.out.println("Sınırını giriniz : ");
        Scanner inp=new Scanner(System.in);
        int k=inp.nextInt();
        System.out.println("-------------------------------------------"+"\n"+"4 ün kuvvetleri");
        for (int i=1;i<=k;i*=4) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------" +"\n"+ "5 in kuvvetleri");

        for (int i=1;i<=k;i*=5){
            System.out.println(i);
        }
    }
}
