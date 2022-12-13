package SPOJ.Accepted.Classical;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class EMOTICON_Emoticons {

    static String[] emoticon;
    static Vector<Integer>[] failure;
    static Vector<pair> interval;

    static class pair {

        Integer l, r;

        public pair(Integer l, Integer r) {
            this.l = l;
            this.r = r;
        }

    }

    public static void main(String[] args) throws IOException {
        OutputStream out = new BufferedOutputStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            int n = Integer.parseInt(st[0]);
            int m = Integer.parseInt(st[1]);
            interval = new Vector<pair>();
            failure = new Vector[n];
            emoticon = new String[n];
            for (int i = 0; i < n; i++) {
                emoticon[i] = br.readLine();
                failure[i] = computeOverlap(emoticon[i].toCharArray());
            }

            int removed = 0;
            int last;
            for (int i = 0; i < m; i++) {
                String line = br.readLine();
                interval.clear();
                for (int j = 0; j < n; j++) {
                    kmpMatcher(line.toCharArray(), emoticon[j].toCharArray(), failure[j]);
                }

                Collections.sort(interval, new Comparator<pair>() {
                    @Override
                    public int compare(pair a, pair b) {
                        return a.r.compareTo(b.r);
                    }
                });

                int sz = interval.size();
                last = -1;
                for (int j = 0; j < sz; j++) {
                    if (interval.get(j).l > last) {
                        removed++;
                        last = interval.get(j).r;
                    }
                }

            }

            out.write((removed + "\n").getBytes());
        }
        out.flush();

    }

    static Vector computeOverlap(char[] pattern) {
        int size = pattern.length;
        Vector<Integer> overlap = new Vector();
        overlap.setSize(size + 1);
        overlap.set(0, -1);
        for (int i = 0; i < size; i++) {
            overlap.set(i + 1, overlap.get(i) + 1);
            while (overlap.get(i + 1) > 0 && pattern[i] != pattern[overlap.get(i + 1) - 1]) {
                overlap.set(i + 1, overlap.get(overlap.get(i + 1) - 1) + 1);
            }
        }
        return overlap;
    }

    static void kmpMatcher(char[] text, char[] pattern, Vector<Integer> overlap) {
        int i, j;
        int emoticonSize = pattern.length;
        for (i = j = 0; i < text.length; i++) {
            while (true) {
                if (text[i] == pattern[j]) {
                    j++;
                    if (j == emoticonSize) {
                        interval.add(new pair(i - emoticonSize + 1, i));
                        j = overlap.get(j);
                    }
                    break;
                } else if (j == 0) {
                    break;
                } else {
                    j = overlap.get(j);
                }
            }
        }
    }


}
