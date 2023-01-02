

package  URI.Accepted.BEGINNER.sourcecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class P2653_Dijkstra {
    
    static Set set = new HashSet();;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {  
            if(!set.contains(input))
            set.add(input);   
        }
        System.out.println(set.size());
    }
    
}
