package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1534 Array 123 https://www.urionlinejudge.com.br/judge/en/problems/view/1534
//Accepted 02/09/2015 - 10:10:42 Runtime:0.456s
import java.util.Scanner;

public class P1534_Array_123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n >= 3 && n < 70) {
                int start = 0;
                int end = n - 1;
                if (n % 2 == 0) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == start) {
                                System.out.print("1");
                            } else if (j == end) {
                                System.out.print("2");
                            } else {
                                System.out.print("3");
                            }
                        }
                        start++;
                        end--;
                        System.out.println("");
                    }
                } else {
                    int mid = (n / 2);
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == mid) {
                                if (j == mid) {
                                    System.out.print("2");
                                } else {
                                    System.out.print("3");
                                }
                            } else {
                                if (j == start) {
                                    System.out.print("1");
                                } else if (j == end) {
                                    System.out.print("2");
                                } else {
                                    System.out.print("3");
                                }
                            }
                        }
                        start++;
                        end--;
                        System.out.println("");
                    }
                }
            }
        }
    }

}
