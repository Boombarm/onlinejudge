package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1019 Time Conversion https://www.urionlinejudge.com.br/judge/en/problems/view/1019
//Accepted 19/06/2015 - 14:50:28 Runtime:0.056s 
import java.util.Scanner;

public class P1019_TimeConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_seconds = sc.nextInt();
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        while (input_seconds > 60) {
            if (input_seconds >= 3600) {
                hours++;
                input_seconds -= 3600;
            } else if (input_seconds >= 60) {
                minutes++;
                input_seconds -= 60;
            }
        }
        seconds = input_seconds;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
