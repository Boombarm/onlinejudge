package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1828 Bazinga! https://www.urionlinejudge.com.br/judge/en/problems/view/1828
//Accepted 08/09/2015 - 13:01:42 Runtime:0.060s
import java.util.Scanner;

public class P1828_Bazinga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] sheldonWin = new String[2];
        for (int i = 1; i <= n; i++) {
            String sheldonSelect = sc.next();
            String rajSelect = sc.next();

            if (sheldonSelect.equals("scissors") || sheldonSelect.equals("tesoura")) {
                sheldonSelect = "scissors";
                sheldonWin = new String[]{"paper", "lizard"};
            } else if (sheldonSelect.equals("paper") || sheldonSelect.equals("papel")) {
                sheldonSelect = "paper";
                sheldonWin = new String[]{"rock", "Spock"};
            } else if (sheldonSelect.equals("rock") || sheldonSelect.equals("pedra")) {
                sheldonSelect = "rock";
                sheldonWin = new String[]{"lizard", "scissors"};
            } else if (sheldonSelect.equals("lizard") || sheldonSelect.equals("lagarto")) {
                sheldonSelect = "lizard";
                sheldonWin = new String[]{"Spock", "paper"};
            } else if (sheldonSelect.equals("Spock")) {
                sheldonWin = new String[]{"scissors", "rock"};
            }

            if (rajSelect.equals("pedra")) {
                rajSelect = "rock";
            } else if (rajSelect.equals("papel")) {
                rajSelect = "paper";
            } else if (rajSelect.equals("tesoura")) {
                rajSelect = "scissors";
            } else if (rajSelect.equals("lagarto")) {
                rajSelect = "lizard";
            }

            if (sheldonSelect.equals(rajSelect)) {
                System.out.println("Caso #" + i + ": De novo!");
            } else if (sheldonWin[0].equals(rajSelect) || sheldonWin[1].equals(rajSelect)) {
                System.out.println("Caso #" + i + ": Bazinga!");
            } else {
                System.out.println("Caso #" + i + ": Raj trapaceou!");
            }
        }
    }

}
