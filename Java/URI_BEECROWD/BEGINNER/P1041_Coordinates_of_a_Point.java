package  URI.Accepted.BEGINNER.sourcecode;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1041 Coordinates of a Point  https://www.urionlinejudge.com.br/judge/en/problems/view/1041
//Accepted 08/08/2015 - 11:40:24 Runtime:0.096s
public class P1041_Coordinates_of_a_Point {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0 && y != 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0 && x != 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0) {
            if (y > 0.0) {
                System.out.println("Q1");
            } else {
                System.out.println("Q4");
            }
        } else {
            if (y > 0.0) {
                System.out.println("Q2");
            } else {
                System.out.println("Q3");
            }
        }
    }
}
