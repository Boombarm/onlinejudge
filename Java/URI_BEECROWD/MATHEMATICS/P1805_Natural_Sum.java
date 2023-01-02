package  URI.Accepted.MATHEMATICS.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 * Solution: ใช้สูตรลัดในการหาผลลัพธ์ 
 * 
 /
 /* หรือใช้การบวกเรื่อยๆ
        long sum = 0;
        for (int i = begin; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
 */
//URI Online Judge | 1805 | [P1] Natural Sum https://www.urionlinejudge.com.br/judge/en/problems/view/1805
//Accepted 29/09/2015 - 02:08:07 Runtime:0.080s
import java.util.Scanner;

public class P1805_Natural_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long begin = sc.nextLong();
        long end = sc.nextLong();
        if (begin == 1) {
            System.out.println(((1 + end) * end) / 2);
        } else {
            long term = (end - begin) + 1;
            System.out.println(((begin + end) * term) / 2);
        }

    }

}
