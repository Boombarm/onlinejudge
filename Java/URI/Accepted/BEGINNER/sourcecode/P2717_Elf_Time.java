package URI.Accepted.BEGINNER.sourcecode;


/**
 * Created by teerapat on 1/10/2018.
 * Answer : Accepted
 * Runtime : 0.028s
 * Submission : 1/10/18, 8:29:35 PM
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2717_Elf_Time {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        if(a+b > n){
            System.out.println("Deixa para amanha!");
        }
        else{
            System.out.println("Farei hoje!");
        }
    }
}
