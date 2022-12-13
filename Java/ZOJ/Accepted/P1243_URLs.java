package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1243 URLs
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=1
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-06-03 01:56:41
 * @Runtime: 24 ms
 * @Solution:
 * @Note:
 */

import java.util.Scanner;

public class P1243_URLs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= c; i++) {
            System.out.println("URL #" + i);
            String protocol = "", host = "", port = "", path = "", p2 = "";
            boolean foundProtocol = false, foundHost = false;
            char input[] = sc.next().toCharArray();

            for (int j = 0; j < input.length; j++) {
                if (input[j] == ':' || input[j] == '/') {
                    //end get protocol
                    if (input[j] == ':' && input[j + 1] == '/' && input[j + 2] == '/' && !foundProtocol) {
                        foundProtocol = true;
                        j += 3;
                    }
                    //end get host
                    else if ((input[j] == ':' || input[j] == '/') && !foundHost) {
                        foundHost = true;
                    }
                }

                if (!foundProtocol) {
                    protocol += input[j];
                }


                if (foundProtocol && !foundHost) {
                    host += input[j];
                }

                if (foundProtocol && foundHost) {
                    p2 += input[j];
                }
            }

            if (p2.length() != 0)
                if (p2.charAt(0) == ':') {
                    int index = 0;
                    for (int j = 1; j < p2.length(); j++) {
                        if (p2.charAt(j) == '/') {
                            index = j + 1;
                            break;
                        } else port += p2.charAt(j);
                    }
                    if (index != 0)
                        for (int j = index; j < p2.length(); j++) {
                            path += p2.charAt(j);
                        }
                } else if (p2.charAt(0) == '/') {
                    for (int j = 1; j < p2.length(); j++) {
                        path += p2.charAt(j);
                    }
                }
            if (port.equals("")) port = "<default>";
            if (path.equals("")) path = "<default>";
            System.out.println("Protocol = " + protocol);
            System.out.println("Host     = " + host);
            System.out.println("Port     = " + port);
            System.out.println("Path     = " + path);
            System.out.println("");
        }
    }


}
    


