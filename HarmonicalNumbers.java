import java.util.Scanner;

public class HarmonicalNumbers {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       double temp;
        double total=0.0;
        int n=inp.nextInt();

        for (int i=1;i<=n;i++){
            temp=1.0/i;
            total+=temp;
            System.out.println(total);
        }
        System.out.println(total);
    }
}
