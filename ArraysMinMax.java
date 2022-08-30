import java.util.Scanner;
import java.util.Arrays;
public class ArraysMinMax {
    public static void main(String[] args) {
        System.out.println("Lütfen sayıyı giriniz : ");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        int min=0,max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<number&& number<arr[i+1]){
                min=arr[i];
                max=arr[i+1];
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
    }

