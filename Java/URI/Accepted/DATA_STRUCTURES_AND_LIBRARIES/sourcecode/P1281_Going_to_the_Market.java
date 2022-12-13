package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1281 Going to the Market https://www.urionlinejudge.com.br/judge/en/problems/view/1281
//Accepted 14/10/2015 - 09:23:22 Runtime:0.272s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class P1281_Going_to_the_Market {

    public static void main(String[] args) throws IOException {
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Map<String, Double> marketPrice = new HashMap<String, Double>();
            double answer = 0.0;
            int marketAmount = Integer.parseInt(br.readLine());

            for (int j = 0; j < marketAmount; j++) {
                String[] st = br.readLine().split(" ");
                marketPrice.put(st[0], Double.parseDouble(st[1]));
            }
            int buyAmount = Integer.parseInt(br.readLine());
            for (int j = 0; j < buyAmount; j++) {
                String[] st = br.readLine().split(" ");
                if (marketPrice.containsKey(st[0])) {
                    answer += (marketPrice.get(st[0]) * Integer.parseInt(st[1]));
                }
            }
            System.out.println(df.format(answer));
        }
    }

}
