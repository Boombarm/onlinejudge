package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1043 Triangle https://www.urionlinejudge.com.br/judge/en/problems/view/1043
//Accepted 07/08/2015 - 01:34:42 Runtime:0.064s 
public class P1043_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if ((b - c) < a && a < (b + c) && (a - c) < b && b < (a + c) && (a - b) < c && c < (a + b)) {
            System.out.println("Perimetro = " + (a + b + c));
        } else {
            System.out.println("Area = " + (((a + b) * c) / 2));
        }
    }

}
