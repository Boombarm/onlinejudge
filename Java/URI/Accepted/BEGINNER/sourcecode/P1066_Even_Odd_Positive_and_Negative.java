package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1066 Even, Odd, Positive and Negative https://www.urionlinejudge.com.br/judge/en/problems/view/1066
//Accepted 10/08/2015 - 07:41:08 Runtime:0.048s 
import java.util.Scanner;

public class P1066_Even_Odd_Positive_and_Negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0, positive = 0, negative = 0;

        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            }

        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positive + " valor(es) positivo(s)");
        System.out.println(negative + " valor(es) negativo(s)");

    }
}
