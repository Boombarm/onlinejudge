package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1309 Monetary Formatting https://www.urionlinejudge.com.br/judge/en/problems/view/1309 
//Accepted 13/10/2015 - 14:24:53 Runtime:0.188s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class P1309_Monetary_Formatting {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat(".00");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = "";
        while ((s1 = br.readLine()) != null) {
            double n = Double.parseDouble(br.readLine()) / 100;
            for (int i = s1.length() - 1, c = 1; i >= 0; i--, c++) {
                if (c == 3 && i != 0) {
                    s1 = s1.substring(0, i) + "," + s1.substring(i);
                    c = 0;
                }

            }
            s1 = "$" + s1 + df.format(n);
            System.out.println(s1);
        }
    }

}
