package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1561 Binary Watch https://www.urionlinejudge.com.br/judge/en/problems/view/1561
//Accepted 30/09/2015 - 16:27:38 Runtime:0.096s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1561_Binary_Watch {

    static char on = 'o', off = ' ';

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String time = "";
        while ((time = br.readLine()) != null) {
            int hour = Integer.parseInt(time.substring(0, 2));
            int minute = Integer.parseInt(time.substring(3, 5));
            char hr[] = new char[]{off, off, off, off};
            char m[] = new char[]{off, off, off, off, off, off};

            if (hour >= 8) {
                hr[0] = on;
                hour -= 8;
            }

            if (hour >= 4) {
                hr[1] = on;
                hour -= 4;
            }

            if (hour >= 2) {
                hr[2] = on;
                hour -= 2;
            }

            if (hour == 1) {
                hr[3] = on;
            }

            if (minute >= 32) {
                m[0] = on;
                minute -= 32;
            }

            if (minute >= 16) {
                m[1] = on;
                minute -= 16;
            }

            if (minute >= 8) {
                m[2] = on;
                minute -= 8;
            }

            if (minute >= 4) {
                m[3] = on;
                minute -= 4;
            }

            if (minute >= 2) {
                m[4] = on;
                minute -= 2;
            }

            if (minute == 1) {
                m[5] = on;
            }

            System.out.println(" ____________________________________________\n"
                    + "|                                            |\n"
                    + "|    ____________________________________    |_\n"
                    + "|   |                                    |   |_)\n"
                    + "|   |   8         4         2         1  |   |\n"
                    + "|   |                                    |   |\n"
                    + "|   |   " + hr[0] + "         " + hr[1] + "         " + hr[2] + "         " + hr[3] + "  |   |\n"
                    + "|   |                                    |   |\n"
                    + "|   |                                    |   |\n"
                    + "|   |   " + m[0] + "     " + m[1] + "     " + m[2] + "     " + m[3] + "     " + m[4] + "     " + m[5] + "  |   |\n"
                    + "|   |                                    |   |\n"
                    + "|   |   32    16    8     4     2     1  |   |_\n"
                    + "|   |____________________________________|   |_)\n"
                    + "|                                            |\n"
                    + "|____________________________________________|\n");
        }
    }

}
