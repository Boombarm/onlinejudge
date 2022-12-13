package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong solution: ใช้สูตรลัดการหาพื้นที่ 2*(root(3)*
 * size^2 ) / 5
 */
//URI Online Judge | 1760 Koch Snowflake https://www.urionlinejudge.com.br/judge/problems/view/1760/rate:1760/rating:2
//Accepted 16/10/2015 - 11:55:51 Runtime:0.200s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class P1760_Koch_Snowflake {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.HALF_EVEN);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            int s = Integer.parseInt(line);
            double area = 2 * (Math.pow(s, 2) * Math.sqrt(3)) / 5;
            System.out.println(df.format(area));
        }
    }

}
