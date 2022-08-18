import java.util.Scanner;

public class triangleMadeWithStars {
    public static void main(String[] args) {
        System.out.println("sayıyı giriniz : ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i=1;i<=n;i++){
            for (int k =1;k<=(n-i);k++) {
                System.out.print(" ");
            }
            for (int m=1;m<=(2*i)-1;m++){
            System.out.print("*");
            }
            System.out.println();
        }

         for (int i=1;i<=(n-1);i++){
            for (int k =1;k<=i;k++) {
                System.out.print(" ");
            }
             for (int m=2*(n-1)-1;m>=(2*i)-1;m--){
                 System.out.print("*");
             }
             System.out.println();
        }

    }
}

