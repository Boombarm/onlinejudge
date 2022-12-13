/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1168 LED
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1168
 * @Timelimit: 1 sec
 * @Status: Accepted 05/09/2015 - 13:58:40 Runtime:0.100s
 * @Solution:
 */
package Accepted.STRINGS.sourcecode;

import java.util.Scanner;

public class P1168_LED {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String number = sc.next();
            int countLED = 0;
            for (int j = 0; j < number.length(); j++) {
                switch (number.charAt(j)) {
                    case '1':
                        countLED += 2;
                        break;
                    case '2':
                        countLED += 5;
                        break;
                    case '3':
                        countLED += 5;
                        break;
                    case '4':
                        countLED += 4;
                        break;
                    case '5':
                        countLED += 5;
                        break;
                    case '6':
                        countLED += 6;
                        break;
                    case '7':
                        countLED += 3;
                        break;
                    case '8':
                        countLED += 7;
                        break;
                    case '9':
                        countLED += 6;
                        break;
                    case '0':
                        countLED += 6;
                        break;
                }
            }
            System.out.println(countLED + " leds");
        }
    }
}
