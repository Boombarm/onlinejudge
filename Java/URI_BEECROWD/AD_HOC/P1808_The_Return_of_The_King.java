package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1808 The Return of The King https://www.urionlinejudge.com.br/judge/en/problems/view/1808
//Accepted 28/09/2015 - 03:13:30 Runtime:0.104s
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1808_The_Return_of_The_King {

    public static void main(String[] args) throws java.io.IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        Pattern p = Pattern.compile("(10|[1-9])");
        Matcher m = p.matcher(text);
        int sum = 0;
        double count = 0;
        while (m.find()) {
            sum += Integer.parseInt(m.group());
            count++;
        }
        double answer = (sum / count);
        System.out.println(df.format(answer));
    }

}
