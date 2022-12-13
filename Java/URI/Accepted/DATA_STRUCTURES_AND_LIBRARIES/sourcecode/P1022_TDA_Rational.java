package Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1022 TDA Rational https://www.urionlinejudge.com.br/judge/en/problems/view/1022
//Accepted 28/09/2015 - 01:16:35 Runtime:0.356s
import java.util.Scanner;

public class P1022_TDA_Rational {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            sc.next();
            int d1 = sc.nextInt();
            String operation2 = sc.next();
            int n2 = sc.nextInt();
            sc.next();
            int d2 = sc.nextInt();

            int num1 = 0, num2 = 0, mdc = 0;
            if (operation2.equals("+")) {
                num1 = (n1 * d2) + (n2 * d1);
                num2 = (d1 * d2);
            } else if (operation2.equals("-")) {
                num1 = (n1 * d2) - (n2 * d1);
                num2 = (d1 * d2);
            } else if (operation2.equals("*")) {
                num1 = (n1 * n2);
                num2 = (d1 * d2);
            } else if (operation2.equals("/")) {
                num1 = (n1 * d2);
                num2 = (n2 * d1);
            }
            mdc = mdc(num1, num2);

            System.out.println(num1 + "/" + num2 + " = " + (num1 / Math.abs(mdc)) + "/" + (num2 / Math.abs(mdc)));
        }
    }

    static int mdc(int n, int d) {
        int maior, menor, c;
        if (n > d) {
            maior = n;
            menor = d;
        } else {
            maior = d;
            menor = n;
        }

        while (maior % menor != 0) {
            c = maior % menor;
            maior = menor;
            menor = c;
        }
        return menor;
    }

}
