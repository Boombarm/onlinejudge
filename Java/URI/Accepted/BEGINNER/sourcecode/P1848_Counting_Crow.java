package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1848 Counting Crow https://www.urionlinejudge.com.br/judge/en/problems/view/1848
//Accepted 08/09/2015 - 16:38:28 Runtime:0.100s
import java.util.Scanner;

public class P1848_Counting_Crow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = 0;
        int count = 0;
        while (time != 3) {
            String caw = sc.nextLine();
            if (caw.startsWith("caw caw")) {
                time++;
                System.out.println(count);
                count = 0;
            }

            if (caw.charAt(2) == '*') {
                count += 1;
            }
            if (caw.charAt(1) == '*') {
                count += 2;
            }
            if (caw.charAt(0) == '*') {
                count += 4;
            }

        }
    }

}
