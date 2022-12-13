package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1930 Electrical Outlet https://www.urionlinejudge.com.br/judge/en/problems/view/1930
//Accepted 28/10/2015 - 15:20:28 Runtime:0.052s
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1930_Electrical_Outlet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int answer = (Integer.parseInt(st[0]) + Integer.parseInt(st[1]) + Integer.parseInt(st[2]) + Integer.parseInt(st[3])) - 3;
        System.out.println(answer);
    }

}
