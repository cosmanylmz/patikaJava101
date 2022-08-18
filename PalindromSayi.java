import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp=number,lastNumber,reverseNumber=0;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=reverseNumber*10+lastNumber;
            temp /=10;
        }
        return number == reverseNumber;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
         int sayi=inp.nextInt();
        System.out.println(isPalindrom(sayi));

    }

}
