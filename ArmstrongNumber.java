import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("sayıyı giriniz : ");
        Scanner inp = new Scanner(System.in);
        int number = inp.nextInt();
        int tempNumber = number;
        int basCount = 0;
        int basValue;
        int basPow;
        int total = 0;
        int total2=0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basCount++;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i = 1; i <= basCount; i++) {
                basPow *= basValue;
            }
            tempNumber /= 10;
            total += basPow;

        }
        if (total == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        System.out.println("---------------------------------------Homework--------------------------------------------------------");
         tempNumber=number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber /= 10;
            total2 += basValue;

        }
        System.out.println("basamakların toplamı : " +total2);
    }
}
