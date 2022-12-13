/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1832 EBCDIC
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1832
 * @Timelimit: 1 sec
 * @Status: Accepted 23/11/2015 - 10:16:24 Runtime:0.116s
 * @Solution: Converse Code to Character
 */
package  URI.Accepted.AD_HOC.sourcecode;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.TreeMap;

public class P1832_EBCDIC {

    static TreeMap<String, Character> EBCDIC_Table = new TreeMap<String, Character>();

    static {
        EBCDIC_Table.put("100", ' ');//64 base 10

        EBCDIC_Table.put("201", 'a');//129 base 10
        EBCDIC_Table.put("202", 'b');//130 base 10
        EBCDIC_Table.put("203", 'c');//131 base 10
        EBCDIC_Table.put("204", 'd');//132 base 10
        EBCDIC_Table.put("205", 'e');//133 base 10
        EBCDIC_Table.put("206", 'f');//134 base 10
        EBCDIC_Table.put("207", 'g');//135 base 10

        EBCDIC_Table.put("210", 'h');//136 base 10
        EBCDIC_Table.put("211", 'i');//137 base 10

        EBCDIC_Table.put("221", 'j');//145 base 10
        EBCDIC_Table.put("222", 'k');//146 base 10
        EBCDIC_Table.put("223", 'l');//147 base 10
        EBCDIC_Table.put("224", 'm');//148 base 10
        EBCDIC_Table.put("225", 'n');//149 base 10
        EBCDIC_Table.put("226", 'o');//150 base 10
        EBCDIC_Table.put("227", 'p');//151 base 10

        EBCDIC_Table.put("230", 'q');//152 base 10
        EBCDIC_Table.put("231", 'r');//153 base 10

        EBCDIC_Table.put("242", 's');//162 base 10
        EBCDIC_Table.put("243", 't');//163 base 10
        EBCDIC_Table.put("244", 'u');//164 base 10
        EBCDIC_Table.put("245", 'v');//165 base 10
        EBCDIC_Table.put("246", 'w');//166 base 10
        EBCDIC_Table.put("247", 'x');//167 base 10

        EBCDIC_Table.put("250", 'y');//168 base 10
        EBCDIC_Table.put("251", 'z');//169 base 10

        EBCDIC_Table.put("301", 'A');//193 base 10
        EBCDIC_Table.put("302", 'B');//194 base 10
        EBCDIC_Table.put("303", 'C');//195 base 10
        EBCDIC_Table.put("304", 'D');//196 base 10
        EBCDIC_Table.put("305", 'E');//197 base 10
        EBCDIC_Table.put("306", 'F');//198 base 10
        EBCDIC_Table.put("307", 'G');//199 base 10

        EBCDIC_Table.put("310", 'H');//200 base 10
        EBCDIC_Table.put("311", 'I');//201 base 10

        EBCDIC_Table.put("321", 'J');//209 base 10
        EBCDIC_Table.put("322", 'K');//210 base 10
        EBCDIC_Table.put("323", 'L');//211 base 10
        EBCDIC_Table.put("324", 'M');//212 base 10
        EBCDIC_Table.put("325", 'N');//213 base 10
        EBCDIC_Table.put("326", 'O');//214 base 10
        EBCDIC_Table.put("327", 'P');//215 base 10

        EBCDIC_Table.put("330", 'Q');//216 base 10
        EBCDIC_Table.put("331", 'R');//217 base 10

        EBCDIC_Table.put("342", 'S');//226 base 10
        EBCDIC_Table.put("343", 'T');//227 base 10
        EBCDIC_Table.put("344", 'U');//228 base 10
        EBCDIC_Table.put("345", 'V');//229 base 10
        EBCDIC_Table.put("346", 'W');//230 base 10
        EBCDIC_Table.put("347", 'X');//231 base 10

        EBCDIC_Table.put("350", 'Y');//232 base 10
        EBCDIC_Table.put("351", 'Z');//233 base 10

        EBCDIC_Table.put("360", '0');//240 base 10
        EBCDIC_Table.put("361", '1');//241 base 10
        EBCDIC_Table.put("362", '2');//242 base 10
        EBCDIC_Table.put("363", '3');//243 base 10
        EBCDIC_Table.put("364", '4');//244 base 10
        EBCDIC_Table.put("365", '5');//245 base 10
        EBCDIC_Table.put("366", '6');//246 base 10
        EBCDIC_Table.put("367", '7');//247 base 10

        EBCDIC_Table.put("370", '8');//248 base 10
        EBCDIC_Table.put("371", '9');//249 base 10
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream out = new BufferedOutputStream(System.out);
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            for (int i = 0; i < st.length; i++) {
                out.write((EBCDIC_Table.get(st[i]) != null ? EBCDIC_Table.get(st[i]) + "" : "*").getBytes());
            }
            out.write("\n".getBytes());
        }
        out.flush();
    }

}
