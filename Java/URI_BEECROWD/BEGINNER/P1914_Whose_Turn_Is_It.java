package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1914 Whose Turn Is It? https://www.urionlinejudge.com.br/judge/en/problems/view/1914
//Accepted 09/09/2015 - 18:11:30 Runtime:0.080s 
import java.util.Scanner;

public class P1914_Whose_Turn_Is_It {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int QT = sc.nextInt();
        String par = "";
        String impar = "";
        String name1 = "", name2 = "";
        for (int i = 0; i < QT; i++) {
            name1 = sc.next();
            if (sc.next().equals("PAR")) {
                par = name1;
            } else {
                impar = name1;
            }
            name2 = sc.next();
            if (sc.next().equals("IMPAR")) {
                impar = name2;
            } else {
                par = name2;
            }

            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (((num1 + num2) % 2) == 0) {
                System.out.println(par);
            } else {
                System.out.println(impar);
            }
        }
    }

}
