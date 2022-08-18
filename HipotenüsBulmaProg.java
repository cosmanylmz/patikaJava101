import java.util.Scanner;

public class HipotenüsBulmaProg {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("a= ?");
        int a=inp.nextInt();
        System.out.println("b= ?");
        int b=inp.nextInt();
        double c =Math.pow((Math.pow(a,2)+Math.pow(b,2)),(0.5));
        double u = (a+b+c) / 2;
        double Alankare = u * (u - a)* (u - b) * (u - c);
        System.out.println("hipo=" + c+ "Alan="+Math.pow(Alankare,(0.5)));

    }
}
