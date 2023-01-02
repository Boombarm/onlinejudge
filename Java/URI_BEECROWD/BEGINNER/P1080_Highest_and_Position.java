package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1080 Highest and Position https://www.urionlinejudge.com.br/judge/en/problems/view/1080
//Accepted 10/08/2015 - 15:06:51 Runtime:0.060s 
import java.util.Scanner;

public class P1080_Highest_and_Position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberAnswer = 0;
        int position = 1;
        int count = 1;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (numberAnswer < n) {
                numberAnswer = n;
                position = count;
            }
            count++;
        }
        System.out.println(numberAnswer);
        System.out.println(position);
    }

}
