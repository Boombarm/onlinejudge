package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1020 Age in Days https://www.urionlinejudge.com.br/judge/en/problems/view/1020
//Accepted 19/06/2015 - 14:58:20 Runtime:0.096s 
import java.util.Scanner;

public class P1020_AgeInDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int year = 0;
        int month = 0;
        while (days >= 30) {
            if (days >= 365) {
                year++;
                days -= 365;
            } else if (days >= 30) {
                month++;
                days -= 30;
            }
        }
        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
