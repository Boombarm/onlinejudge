package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1329 Head or Tail https://www.urionlinejudge.com.br/judge/en/problems/view/1329
//Accepted 30/09/2015 - 23:02:10 Runtime:0.320s
import java.util.Scanner;

public class P1329_Head_or_Tail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int mary = 0, john = 0;
            for (int i = 0; i < n; i++) {
                int number = sc.nextInt();
                if (number == 0) {
                    mary++;
                } else {
                    john++;
                }
            }
            System.out.println("Mary won " + mary + " times and John won " + john + " times");
        }
    }

}
