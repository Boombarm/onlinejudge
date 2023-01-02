package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1008 Salary https://www.urionlinejudge.com.br/judge/en/problems/view/1008
//Accepted  09/06/2015 - 10:20:41 Runtime:0.088s 
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1008_Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        float input3 = sc.nextFloat();
        System.out.println("NUMBER = " + input1);
        System.out.println("SALARY = U$ " + df.format(input2 * input3));
    }
}
