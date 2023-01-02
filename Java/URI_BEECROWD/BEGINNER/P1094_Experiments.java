package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1094 Experiments https://www.urionlinejudge.com.br/judge/en/problems/view/1094
//Accepted 11/08/2015 - 07:35:54 Runtime:0.128s
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1094_Experiments {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rabbit = 0, rat = 0, frog = 0;
        int countAmount = 0;
        for (int i = 0; i < n; i++) {
            int amount = sc.nextInt();
            String type = sc.next();
            if (type.equals("C")) {
                rabbit += amount;
            } else if (type.equals("R")) {
                rat += amount;
            } else if (type.equals("S")) {
                frog += amount;
            }
            countAmount += amount;
        }
        System.out.println("Total: " + countAmount + " cobaias");
        System.out.println("Total de coelhos: " + rabbit);
        System.out.println("Total de ratos: " + rat);
        System.out.println("Total de sapos: " + frog);
        System.out.println("Percentual de coelhos: " + df.format((double) (100 * rabbit) / countAmount) + " %");
        System.out.println("Percentual de ratos: " + df.format((double) (100 * rat) / countAmount) + " %");
        System.out.println("Percentual de sapos: " + df.format((double) (100 * frog) / countAmount) + " %");
    }

}
