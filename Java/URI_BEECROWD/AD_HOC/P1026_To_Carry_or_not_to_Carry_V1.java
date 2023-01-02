package URI.Accepted.AD_HOC.sourcecode;



/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1026 To Carry or not to Carry https://www.urionlinejudge.com.br/judge/en/problems/view/1026
//Accepted 02/10/2015 - 12:02:40 Runtime:1.600s
import java.util.Scanner;

public class P1026_To_Carry_or_not_to_Carry_V1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == b) {
                System.out.println("0");
            } else if (a == 0 && b != 0) {
                System.out.println(b);
            } else if (a != 0 && b == 0) {
                System.out.println(a);
            } else {
                long answer = 0;
                String n = getBinary(a);
                String m = getBinary(b);
                if (m.length() == n.length()) {
                    int k = 0;
                    for (int i = n.length() - 1, j = 0; i >= 0; i--, j++) {
                        if (n.charAt(i) != m.charAt(i)) {
                            answer += Math.pow(2, k);
                        }
                        k++;
                    }
                } else if (m.length() > n.length()) {
                    int t = m.length() - n.length();
                    int k = 0;
                    for (int i = m.length() - 1, j = n.length() - 1; i >= t; i--, j--) {
                        if (n.charAt(j) != m.charAt(i)) {
                            answer += Math.pow(2, k);
                        }
                        k++;
                    }

                    for (int i = t - 1; i >= 0; i--) {
                        if (m.charAt(i) == '1') {
                            answer += Math.pow(2, k);
                        }
                        k++;
                    }

                } else {
                    int t = n.length() - m.length();
                    int k = 0;
                    for (int i = n.length() - 1, j = m.length() - 1; i >= t; i--, j--) {
                        if (m.charAt(j) != n.charAt(i)) {
                            answer += Math.pow(2, k);
                        }
                        k++;
                    }

                    for (int i = t - 1; i >= 0; i--) {
                        if (n.charAt(i) == '1') {
                            answer += Math.pow(2, k);
                        }
                        k++;
                    }

                }
                System.out.println(answer);
            }

        }
    }

    static String getBinary(long num) {
        String answer = "";
        for (long n = num; n > 0; n /= 2) {
            long r = n % 2;
            answer = r + answer;
        }
        return answer;
    }

}
