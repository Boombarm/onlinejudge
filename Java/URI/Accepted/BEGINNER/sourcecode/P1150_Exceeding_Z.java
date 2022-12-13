package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1150 Exceeding Z https://www.urionlinejudge.com.br/judge/en/problems/view/1150
//Accepted 24/08/2015 - 05:31:43 Runtime:0.064s
import java.util.Scanner;

public class P1150_Exceeding_Z {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            if (z <= x) {
                z = sc.nextInt();
            }

            if (z > x) {
                for (int i = x; sum <= z; i++) {
                    sum += i;
                    count++;
                }
                System.out.println(count);
                break;
            }
        }
    }

}
