package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1046 Game Time https://www.urionlinejudge.com.br/judge/en/problems/view/1046
//Accepted 11/08/2015 - 12:05:56 Runtime:0.052s
import java.util.Scanner;

public class P1046_Game_Time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startGame = sc.nextInt();
        int endGame = sc.nextInt();
        if (startGame == endGame) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else if (startGame > endGame) {
            System.out.println("O JOGO DUROU " + ((24 + endGame) - startGame) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + (endGame - startGame) + " HORA(S)");
        }
    }

}
