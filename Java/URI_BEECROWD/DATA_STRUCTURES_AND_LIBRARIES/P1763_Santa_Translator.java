package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1763 Santa's Translator https://www.urionlinejudge.com.br/judge/problems/view/1763/rate:1763/rating:1
//Accepted 14/10/2015 - 11:23:01 Runtime:0.236s
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class P1763_Santa_Translator {

    static Map<String, String> Translator = new HashMap<String, String>();

    static {
        Translator.put("brasil", "Feliz Natal!");
        Translator.put("alemanha", "Frohliche Weihnachten!");
        Translator.put("austria", "Frohe Weihnacht!");
        Translator.put("coreia", "Chuk Sung Tan!");
        Translator.put("espanha", "Feliz Navidad!");
        Translator.put("grecia", "Kala Christougena!");
        Translator.put("estados-unidos", "Merry Christmas!");
        Translator.put("inglaterra", "Merry Christmas!");
        Translator.put("australia", "Merry Christmas!");
        Translator.put("portugal", "Feliz Natal!");
        Translator.put("suecia", "God Jul!");
        Translator.put("turquia", "Mutlu Noeller");
        Translator.put("argentina", "Feliz Navidad!");
        Translator.put("chile", "Feliz Navidad!");
        Translator.put("mexico", "Feliz Navidad!");
        Translator.put("antardida", "Merry Christmas!");
        Translator.put("canada", "Merry Christmas!");
        Translator.put("irlanda", "Nollaig Shona Dhuit!");
        Translator.put("belgica", "Zalig Kerstfeest!");
        Translator.put("italia", "Buon Natale!");
        Translator.put("libia", "Buon Natale!");
        Translator.put("siria", "Milad Mubarak!");
        Translator.put("marrocos", "Milad Mubarak!");
        Translator.put("japao", "Merii Kurisumasu!");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String data = "";
        while ((data = br.readLine()) != null) {
            if (Translator.containsKey(data)) {
                bw.write(Translator.get(data) + "\n");
            } else {
                bw.write("--- NOT FOUND ---\n");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }

}
