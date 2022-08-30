import java.util.Scanner;

public class MatrisTranspoze {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Satır giriniz : ");
        int row  = inp.nextInt();
        System.out.println("Sütun giriniz : ");
        int col = inp.nextInt();
        int[][] matris = new int[row][col];

        int[][] transpose = new int[col][row];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println(i + "x" + j + " matrisi gir : ");
                matris[i][j] = inp.nextInt();

            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris");
        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {

                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Transpose");
        for (int i = 0; i < transpose.length; i++) {

            for (int j = 0; j < transpose[i].length; j++) {

                System.out.print(transpose[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
