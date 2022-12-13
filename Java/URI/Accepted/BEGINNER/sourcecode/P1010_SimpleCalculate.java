package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1010 Simple Calculate https://www.urionlinejudge.com.br/judge/en/problems/view/1010
//Accepted 09/06/2015 - 14:33:06 Runtime:0.056s 
import java.util.Scanner;

public class P1010_SimpleCalculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();//Product 1
        int count1 = sc.nextInt();
        float price1 = sc.nextFloat();
        sc.nextInt();//Product 2
        int count2 = sc.nextInt();
        float price2 = sc.nextFloat();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ((count1 * price1) + (count2 * price2)));
    }
}
