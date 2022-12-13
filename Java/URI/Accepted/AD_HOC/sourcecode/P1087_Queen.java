package  URI.Accepted.AD_HOC.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1087 Queen https://www.urionlinejudge.com.br/judge/en/problems/view/1087
//Accepted 01/10/2015 - 06:57:38 Runtime:0.156s
import java.util.Scanner;

public class P1087_Queen {
//sss
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int startR = sc.nextInt();
            int startC = sc.nextInt();
            int endR = sc.nextInt();
            int endC = sc.nextInt();
            if (startR == 0 && startC == 0 && endR == 0 && endC == 0) {
                break;
            } else if (startR == endR && startC == endC) {
                System.out.println("0");
            } else if (startR == endR || startC == endC) {
                System.out.println("1");
            } else {
                int i = 0, j = 0;
                if (endR > startR && endC < startC) {//find top_left ok
                    i = startR + 1;
                    j = startC - 1;
                    while (true) {
                        if (i == endR) {
                            if (j == endC) {
                                System.out.println("1");
                            } else {
                                System.out.println("2");
                            }
                            break;
                        }
                        i++;
                        j--;
                    }
                } else if (endR > startR && endC > startC) {//find top_right ok
                    i = startR + 1;
                    j = startC + 1;
                    while (true) {
                        if (i == endR) {
                            if (j == endC) {
                                System.out.println("1");
                            } else {
                                System.out.println("2");
                            }
                            break;
                        }
                        i++;
                        j++;
                    }
                } else if (endR < startR && endC < startC) {//find bottom_left
                    i = startR - 1;
                    j = startC - 1;
                    while (true) {
                        if (i == endR) {
                            if (j == endC) {
                                System.out.println("1");
                            } else {
                                System.out.println("2");
                            }
                            break;
                        }
                        i--;
                        j--;
                    }

                } else if (endR < startR && endC > startC) {//find bottom_right
                    i = startR - 1;
                    j = startC + 1;
                    while (true) {
                        if (i == endR) {
                            if (j == endC) {
                                System.out.println("1");
                            } else {
                                System.out.println("2");
                            }
                            break;
                        }
                        i--;
                        j++;
                    }
                }
            }
        }
    }

}
