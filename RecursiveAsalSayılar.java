import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class RecursiveAsalSayılar {

    static void isAsalSayi(int n){
        int count=0;
      for (int i=1;i<=n;i++){
          if (n % i==0){
              count++;
          }
      }
      if (count==2){
          System.out.println(n+" asal sayıdır ");
      }else System.out.println(n+" sayısı asal değildir");

    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int a=inp.nextInt();
        isAsalSayi(a);
    }
}
