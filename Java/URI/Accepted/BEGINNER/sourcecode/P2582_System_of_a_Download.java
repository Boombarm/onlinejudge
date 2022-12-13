/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: Beginner
 * @Problem: 2582 - System of a Download
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2582
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 6/16/17, 3:45:50 PM
 * @Runtime: 0.036s 
 * @Solution:
 * @Note:
 */
package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P2582_System_of_a_Download {

    static int song;
    static String[] songs = {"PROXYCITY", "P.Y.N.G.", "DNSUEY!", "SERVERS", "HOST!", "CRIPTONIZE", "OFFLINE DAY", "SALT", "ANSWER!", "RAR?", "WIFI ANTENNAS"};

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        OutputStreamWriter ow = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(ow);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] in = br.readLine().split(" ");
            song = Integer.parseInt(in[0]) + Integer.parseInt(in[1]);
            bw.append(songs[song] + "\n");
        }
        bw.flush();
    }

}
