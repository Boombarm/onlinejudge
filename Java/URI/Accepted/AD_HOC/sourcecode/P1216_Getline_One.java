package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1216 Getline One https://www.urionlinejudge.com.br/judge/en/problems/view/1216
//Accepted 30/09/2015 - 23:14:09 Runtime:0.088s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1216_Getline_One {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("0.0");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        double sum = 0;
        while (br.readLine() != null) {
            sum += Integer.parseInt(br.readLine());
            count++;
        }
        System.out.println(df.format(sum / count));
    }

}
