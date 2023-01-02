package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1021 Banknotes and Coins https://www.urionlinejudge.com.br/judge/en/problems/view/1021
//Accepted 19/06/2015 - 18:55:34 Runtime:0.060s 
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1021_BanknotesandCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        float money = sc.nextFloat();
        int bank100 = 0;
        int bank50 = 0;
        int bank20 = 0;
        int coin10 = 0;
        int coin5 = 0;
        int coin2 = 0;
        int coin1 = 0;
        int coin050 = 0;
        int coin025 = 0;
        int coin010 = 0;
        int coin005 = 0;
        int coin001 = 0;
        while (money > 0.00) {

            if (money >= 100.00) {
                bank100++;
                money -= 100;
            } else if (money >= 50.00) {
                bank50++;
                money -= 50.00;
            } else if (money >= 20.00) {
                bank20++;
                money -= 20.00;
            } else if (money >= 10.00) {
                coin10++;
                money -= 10.00;
            } else if (money >= 5.00) {
                coin5++;
                money -= 5.00;
            } else if (money >= 2.00) {
                coin2++;
                money -= 2.00;
            } else if (money >= 1.00) {
                coin1++;
                money -= 1.00;
            } else if (money >= 0.50) {
                coin050++;
                money -= 0.50;
            } else if (money >= 0.25) {
                coin025++;
                money -= 0.25;
            } else if (money >= 0.10) {
                coin010++;
                money -= 0.10;
            } else if (money >= 0.05) {
                coin005++;
                money -= 0.05;
            } else {
                money = Float.parseFloat(df.format(money));
                coin001++;
                money -= 0.01;
            }
        }
        System.out.println("NOTAS:\n"
                + +bank100 + " nota(s) de R$ 100.00\n"
                + +bank50 + " nota(s) de R$ 50.00\n"
                + +bank20 + " nota(s) de R$ 20.00\n"
                + +coin10 + " nota(s) de R$ 10.00\n"
                + +coin5 + " nota(s) de R$ 5.00\n"
                + +coin2 + " nota(s) de R$ 2.00\n"
                + "MOEDAS:\n"
                + +coin1 + " moeda(s) de R$ 1.00\n"
                + +coin050 + " moeda(s) de R$ 0.50\n"
                + +coin025 + " moeda(s) de R$ 0.25\n"
                + +coin010 + " moeda(s) de R$ 0.10\n"
                + +coin005 + " moeda(s) de R$ 0.05\n"
                + +coin001 + " moeda(s) de R$ 0.01");
    }
}
