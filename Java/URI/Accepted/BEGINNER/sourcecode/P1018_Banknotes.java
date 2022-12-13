package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1018 Banknotes https://www.urionlinejudge.com.br/judge/en/problems/view/1018
//Accepted 19/06/2015 - 14:39:13 Runtime:0.104s 
import java.util.Scanner;

public class P1018_Banknotes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int bank100 = 0;
        int bank50 = 0;
        int bank20 = 0;
        int coin10 = 0;
        int coin5 = 0;
        int coin2 = 0;
        int coin1 = 0;
        System.out.println(money);
        while (money > 0) {
            if (money >= 100) {
                bank100++;
                money -= 100;
            } else if (money >= 50) {
                bank50++;
                money -= 50;
            } else if (money >= 20) {
                bank20++;
                money -= 20;
            } else if (money >= 10) {
                coin10++;
                money -= 10;
            } else if (money >= 5) {
                coin5++;
                money -= 5;
            } else if (money >= 2) {
                coin2++;
                money -= 2;
            } else {
                coin1++;
                money -= 1;
            }
        }
        System.out.println(bank100 + " nota(s) de R$ 100,00");
        System.out.println(bank50 + " nota(s) de R$ 50,00");
        System.out.println(bank20 + " nota(s) de R$ 20,00");
        System.out.println(coin10 + " nota(s) de R$ 10,00");
        System.out.println(coin5 + " nota(s) de R$ 5,00");
        System.out.println(coin2 + " nota(s) de R$ 2,00");
        System.out.println(coin1 + " nota(s) de R$ 1,00");
    }
}
