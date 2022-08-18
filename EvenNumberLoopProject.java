import java.util.Scanner;

public class EvenNumberLoopProject {
    public static void main(String[] args) {
        System.out.println("sayınızı giriniz");
        Scanner inp=new Scanner(System.in);
        int k=inp.nextInt();
        int a=0;
        int count=0;
        for (int i =1;i<k;i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
                a=a+i;
                count++;
            }
        }
        if (count==0){
            System.out.println("there is no matches");
            System.exit(0);
        }
        System.out.println("average of numbers is "+a/count);
    }
}
