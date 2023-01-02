package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1561 WERTYU https://www.urionlinejudge.com.br/judge/en/problems/view/1196
//Accepted 30/10/2015 - 18:06:06 Runtime:0.096s
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1196_WERTYU {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = "";
        while ((line = br.readLine()) != null) {
            String answer = "";
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                switch (c) {
                    case ' ':
                        bw.append(' ');
                        break;
                    case '`':
                        break;
                    case 'Q':
                        break;
                    case 'A':
                        break;
                    case 'Z':
                        break;
                    case '1':
                        bw.append('`');
                        break;
                    case '2':
                        bw.append('1');
                        break;
                    case '3':
                        bw.append('2');
                        break;
                    case '4':
                        bw.append('3');
                        break;
                    case '5':
                        bw.append('4');
                        break;
                    case '6':
                        bw.append('5');
                        break;
                    case '7':
                        bw.append('6');
                        break;
                    case '8':
                        bw.append('7');
                        break;
                    case '9':
                        bw.append('8');
                        break;
                    case '0':
                        bw.append('9');
                        break;
                    case '-':
                        bw.append('0');
                        break;
                    case '=':
                        bw.append('-');
                        break;

                    case 'W':
                        bw.append('Q');
                        break;
                    case 'E':
                        bw.append('W');
                        break;
                    case 'R':
                        bw.append('E');
                        break;
                    case 'T':
                        bw.append('R');
                        break;
                    case 'Y':
                        bw.append('T');
                        break;
                    case 'U':
                        bw.append('Y');
                        break;
                    case 'I':
                        bw.append('U');
                        break;
                    case 'O':
                        bw.append('I');
                        break;
                    case 'P':
                        bw.append('O');
                        break;
                    case '[':
                        bw.append('P');
                        break;
                    case ']':
                        bw.append('[');
                        break;
                    case '\\':
                        bw.append(']');
                        break;

                    case 'S':
                        bw.append('A');
                        break;
                    case 'D':
                        bw.append('S');
                        break;
                    case 'F':
                        bw.append('D');
                        break;
                    case 'G':
                        bw.append('F');
                        break;
                    case 'H':
                        bw.append('G');
                        break;
                    case 'J':
                        bw.append('H');
                        break;
                    case 'K':
                        bw.append('J');
                        break;
                    case 'L':
                        bw.append('K');
                        break;
                    case ';':
                        bw.append('L');
                        break;
                    case '\'':
                        bw.append(';');
                        break;

                    case 'X':
                        bw.append('Z');
                        break;
                    case 'C':
                        bw.append('X');
                        break;
                    case 'V':
                        bw.append('C');
                        break;
                    case 'B':
                        bw.append('V');
                        break;
                    case 'N':
                        bw.append('B');
                        break;
                    case 'M':
                        bw.append('N');
                        break;
                    case ',':
                        bw.append('M');
                        break;
                    case '.':
                        bw.append(',');
                        break;
                    case '/':
                        bw.append('.');
                        break;
                }
            }
            bw.newLine();
        }
        bw.flush();
    }

}
