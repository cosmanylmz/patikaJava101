import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        System.out.println("basamak sayısını giriniz : ");
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        for (int i=n;i>0;i--){
            for (int m=n-i;m>0;m--) {
                System.out.print(" ");
            }
            for (int k=(2*i)-1;k>0;k--){
                    System.out.print("*");

            }
            System.out.println();
        }


        }
    }

