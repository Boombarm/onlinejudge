package th.in.devboom.uri.accepted;

/**
 * Created by Teerapat-BSD on 1/9/2018.
 * Answer : Accepted
 * Runtime : 0.020s
 * Submission : 1/9/18, 11:43:52 AM
 */
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class P2633_Barbecue_at_Yuris {
    static  Map<Integer, String> map;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input  = br.readLine()) != null){
            int t = Integer.parseInt(input);
            map = new TreeMap<Integer, String>();
            while (t-- > 0){
                String[] in = br.readLine().split(" ");
                String name = in[0];
                int n = Integer.parseInt(in[1]);
                map.put(n, name);
            }
            boolean printed = false;
            for (Map.Entry<Integer,String> entry : map.entrySet()){
                if(printed) {
                    bw.append(" ");
                }
                else{
                    printed = true;
                }
                bw.append(entry.getValue());
            }
            bw.newLine();
        }
        bw.flush();
    }
}
