package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1180 Lowest Number and Position https://www.urionlinejudge.com.br/judge/en/problems/view/1180
//Accepted 10/08/2015 - 09:46:15 Runtime:0.072s 
import java.util.Scanner;

public class P1180_Lowest_Number_and_Position {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1 && n <= 1000) {
            int answerNum = 0;
            int num = sc.nextInt();
            answerNum = num;
            int position = 0;
            for (int i = 1; i < n; i++) {
                num = sc.nextInt();
                if (answerNum > num) {
                    answerNum = num;
                    position = i;
                }
            }
            System.out.println("Menor valor: " + answerNum);
            System.out.println("Posicao: " + position);
        }
    }

}
