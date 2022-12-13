package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1240 Fit or Dont Fit I https://www.urionlinejudge.com.br/judge/en/problems/view/1240
//Accepted 30/09/2015 - 01:55:51 Runtime:0.268s
import java.util.Scanner;

public class P1240_Fit_or_Dont_Fit_I {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            if (a.equals(b)) {
                System.out.println("encaixa");
            } else {
                if (b.length() < a.length()) {
                    int saLength = a.length();
                    int sbLength = b.length();
                    boolean fit = true;
                    for (int j = saLength - 1; j >= saLength - sbLength; j--) {
                        if (a.charAt(j) - b.charAt((j - (saLength - sbLength))) != 0) {
                            fit = false;
                            break;
                        }
                    }

                    if (fit) {
                        System.out.println("encaixa");
                    } else {
                        System.out.println("nao encaixa");
                    }
                } else {
                    System.out.println("nao encaixa");
                }
            }
        }
    }

}
