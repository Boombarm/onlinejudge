
/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1273 Justifier
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1273
 * @Status: 
 * @Solution: Accepted 19/10/2015 - 08:28:11 Runtime:0.172s
 */
package  URI.Accepted.STRINGS.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1273_Justifier {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                   
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
        int n = Integer.parseInt(br.readLine());
        while (true) {            
            String[] st = new String[n];
            int maxLength = 0;
            for (int i = 0; i < n; i++) {
                st[i] = br.readLine();
                if(maxLength < st[i].length()) maxLength = st[i].length();
            }
            
            for (int i = 0; i < n; i++) {
                bw.append(i < n-1 ? setBlankSpace(st[i], maxLength)+"\n": setBlankSpace(st[i], maxLength));
            }
            bw.newLine();
            bw.flush();
            
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            bw.newLine();
            bw.flush();
        }
    }
    
    
    static String setBlankSpace(String text, int length){
        for (int i = text.length(); i < length; i++) {
            text = " "+text;
        }
        return text;
    }
    
}
