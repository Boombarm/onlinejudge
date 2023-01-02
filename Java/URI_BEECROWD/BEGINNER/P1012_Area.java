package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1012 Area https://www.urionlinejudge.com.br/judge/en/problems/view/1012
//Accepted 10/06/2015 - 11:17:13 Runtime:0.056s 
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1012_Area {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        df.setRoundingMode(RoundingMode.HALF_DOWN);
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        System.out.println("TRIANGULO: " + df.format((a * c) / 2));//a) the area of the rectangled triangle that has base A and height C.
        System.out.println("CIRCULO: " + df.format(3.14159 * (c * c)));//b) the area of the circle of radius C. (pi = 3.14159) 
        System.out.println("TRAPEZIO: " + df.format(((a + b) * c) / 2));//c) the area of the trapezium which has base A and B and C by height.
        System.out.println("QUADRADO: " + df.format(b * b));//d) the area of ​​the square that has side B.s
        System.out.println("RETANGULO: " + df.format(a * b));//e) the area of the rectangle that has sides A and B. 
    }
}
