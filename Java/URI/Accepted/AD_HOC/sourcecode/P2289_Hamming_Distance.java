package Accepted.AD_HOC.sourcecode;
/*
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Categories: AD-HOC
 * @Problem: 2289 - Hamming Distance
 * @Link: https://www.beecrowd.com.br/judge/en/problems/view/2289
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Submission: 12/18/22, 5:08:46 PM
 * @Runtime: 0.751s
 * @Solution: Brian Kerninghan's Algorithm
 * @Note: นับ bit ที่แตกต่างกัน ระหว่างเลขฐานสอง สองตัว
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class P2289_Hamming_Distance {

    static int solve(BigInteger A, BigInteger B) {
        BigInteger XOR = A.xor(B);
        // Check for 1's in the binary form using
        // Brian Kerninghan's Algorithm
        int count = 0;
        while (XOR.compareTo(BigInteger.ZERO) > 0) {
            XOR = XOR.and(XOR.subtract(BigInteger.ONE));
            count++;
        }
        // return the count of different bits
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String st;
        while (!(st = br.readLine()).contains("0 0")) {
            String[] stArr = st.split(" ");
            BigInteger x = new BigInteger(stArr[0]);
            BigInteger y = new BigInteger(stArr[1]);
            int answer = solve(x, y);
            bw.append(answer + "\n");
        }
        bw.flush();
    }
}
