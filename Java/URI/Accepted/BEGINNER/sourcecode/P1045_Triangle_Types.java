package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1045 Triangle Types https://www.urionlinejudge.com.br/judge/en/problems/view/1045
//Accepted 11/08/2015 - 05:47:48 Runtime:0.064s
import java.util.Scanner;

public class P1045_Triangle_Types {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextFloat();
        double B = sc.nextFloat();
        double C = sc.nextFloat();

        if (B > A && B > C) {
            double tmp = A;
            A = B;
            B = tmp;
        } else if (C > A && C > B) {
            double tmp = A;
            A = C;
            C = tmp;
        }

        double powA = Math.pow(A, 2);
        double powB = Math.pow(B, 2);
        double powC = Math.pow(C, 2);

        if (A > 0 && B > 0 && C > 0) {
            if (A >= (B + C)) {
                System.out.println("NAO FORMA TRIANGULO");
            } else if (powA == (powB + powC)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (powA > (powB + powC)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (powA < (powB + powC)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if ((A == B) && (B == C) && (C == A)) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((A == B) || (B == C) || (A == C)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }

}
