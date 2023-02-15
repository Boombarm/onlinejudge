import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2473_Loteria {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in1 = br.readLine().split(" ");
        String[] in2 = br.readLine().split(" ");
        boolean[] mapped = new boolean[6];
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (!mapped[j] && in1[i].equals(in2[j])) {
                    count++;
                    mapped[j] = true;
                    break;
                }
            }
        }

        switch (count) {
            case 3:
                System.out.println("terno");
                break;
            case 4:
                System.out.println("quadra");
                break;
            case 5:
                System.out.println("quina");
                break;
            case 6:
                System.out.println("sena");
                break;
            default:
                System.out.println("azar");
        }
    }
    
}