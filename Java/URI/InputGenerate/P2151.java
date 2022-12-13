package URI.InputGenerate;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class P2151 {

    /**
     * @param args total input
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int maxRandom = 20;
        int minRandom = 1;
        int n, m, x, y;
        try {
            Integer c = Integer.parseInt(br.readLine());//total input
            System.out.println(c);
            while (c-- > 0) {
                m = random.nextInt((maxRandom - minRandom) + 1) + minRandom;
                n = random.nextInt((maxRandom - minRandom) + 1) + minRandom;
                x = random.nextInt((m - 1) + 1) + 1;
                y = random.nextInt((n - 1) + 1) + 1;
                System.out.println(m + " " + n + " " + x + " " + y);
                for (int i = 0; i < m; i++) {
                    boolean printed = false;
                    for (int j = 0; j < n; j++) {
                        System.out.print(printed ? " 0" : '0');
                        printed = true;
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
