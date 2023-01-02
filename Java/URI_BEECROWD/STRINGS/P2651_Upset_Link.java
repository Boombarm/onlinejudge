package  URI.Accepted.STRINGS.sourcecode;

/**
 * Created by teerapat on 1/30/2018.
 * Answer : Accepted
 * Submission : 1/30/18, 10:10:13 PM
 * Runtime : 0.040s
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2651_Upset_Link {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine().toLowerCase();
        System.out.println(in.indexOf("zelda") != -1 ? "Link Bolado" : "Link Tranquilo");
    }
}
