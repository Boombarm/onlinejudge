package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1397 Game of The Greatest https://www.urionlinejudge.com.br/judge/en/problems/view/1397
//Accepted 30/09/2015 - 13:53:56 Runtime:0.240s 
import java.util.Scanner;

public class P1397_Game_of_The_Greatest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int ogScore = 0, childScore = 0;
            for (int i = 0; i < n; i++) {
                int ogNumber = sc.nextInt();
                int childNumber = sc.nextInt();
                if (ogNumber > childNumber) {
                    ogScore++;
                } else if (childNumber > ogNumber) {
                    childScore++;
                }
            }
            System.out.println(ogScore + " " + childScore);
        }

    }

}
