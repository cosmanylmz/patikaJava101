import java.util.Arrays;
import java.util.Scanner;

public class CompleteArrayWithInputs {
    public static void main(String[] args) {
        System.out.println("dizi boyutunu giriniz : ");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int[] arr=new int[n];
        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i=0;i<n;i++){
            int a=inp.nextInt();
            arr[i]=a;
            System.out.println((i+1)+". Elemanı : "+arr[i]);

        }
        Arrays.sort(arr);
        System.out.println("Sıralama : "+Arrays.toString(arr));
    }
}
