package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1118 Several Scores with Validation https://www.urionlinejudge.com.br/judge/en/problems/view/1118
//Accepted 23/08/2015 - 10:28:35 Runtime:0.184s
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1118_Several_Scores_with_Validation {

    static boolean setA = false;
    static int countAnswer = 0;
    static double a = 0, b = 0;
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        while (true) {
            if (countAnswer == 0) {
                callculate();
            } else {
                System.out.println("novo calculo (1-sim 2-nao)");
                int x = sc.nextInt();
                if (x == 2) {
                    break;
                }
                if (x == 1) {
                    callculate();
                }
            }
        }
    }

    static void callculate() {
        while (true) {
            double num = sc.nextDouble();
            if (num >= 0.0 && num <= 10.0) {
                if (!setA) {
                    a = num;
                    setA = true;
                } else {
                    b = num;
                    System.out.println("media = " + df.format((a + b) / 2));
                    countAnswer++;
                    a = 0;
                    b = 0;
                    setA = false;
                    break;
                }
            } else {
                System.out.println("nota invalida");
            }
        }
    }

}
