/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1873 Rock-paper-scissors-lizard-Spock
 * @Timelimit: 1 sec
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1873
 * @Status: Accepted 27/09/2015 - 00:40:00 Runtime:0.060s
 * @Solution:
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.util.Scanner;

public class P1873_Rock_paper_scissors_lizard_Spock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String rajeshWeapon = sc.next();
            String sheldonWeapon = sc.next();
            String[] rajeshWin = null;

            if (sheldonWeapon.equals("pedra")) {
                sheldonWeapon = "rock";
            } else if (sheldonWeapon.equals("papel")) {
                sheldonWeapon = "paper";
            } else if (sheldonWeapon.equals("tesoura")) {
                sheldonWeapon = "scissors";
            } else if (sheldonWeapon.equals("lagarto")) {
                sheldonWeapon = "lizard";
            }

            if (rajeshWeapon.equals("pedra")) {
                rajeshWeapon = "rock";
            } else if (rajeshWeapon.equals("papel")) {
                rajeshWeapon = "paper";
            }
            if (rajeshWeapon.equals("tesoura")) {
                rajeshWeapon = "scissors";
            } else if (rajeshWeapon.equals("lagarto")) {
                rajeshWeapon = "lizard";
            }

            if (rajeshWeapon.equals("spock")) {
                rajeshWin = new String[]{"scissors", "rock"};
            } else if (rajeshWeapon.equals("rock")) {
                rajeshWin = new String[]{"lizard", "scissors"};
            } else if (rajeshWeapon.equals("paper")) {
                rajeshWin = new String[]{"spock", "rock"};
            } else if (rajeshWeapon.equals("scissors")) {
                rajeshWin = new String[]{"paper", "lizard"};
            } else if (rajeshWeapon.equals("lizard")) {
                rajeshWin = new String[]{"spock", "paper"};
            }

            if (rajeshWeapon.equals(sheldonWeapon)) {
                System.out.println("empate");
            } else if (rajeshWin[0].equals(sheldonWeapon) || rajeshWin[1].equals(sheldonWeapon)) {
                System.out.println("rajesh");
            } else {
                System.out.println("sheldon");
            }

        }
    }

}
