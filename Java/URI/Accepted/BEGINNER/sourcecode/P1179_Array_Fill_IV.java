package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//
//
import java.util.Scanner;

public class P1179_Array_Fill_IV {

    public static void main(String[] args) {
        int oddNumber[] = new int[5];
        int evenNumber[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int countEvenNumber = 0, countOddNumber = 0;
        for (int i = 0; i < 15; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenNumber[countEvenNumber] = num;
                countEvenNumber++;
                if (countEvenNumber == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + evenNumber[j]);
                    }
                    countEvenNumber = 0;
                }
            } else {
                oddNumber[countOddNumber] = num;
                countOddNumber++;
                if (countOddNumber == 5) {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + oddNumber[j]);
                    }
                    countOddNumber = 0;
                }
            }
        }
        if (countOddNumber != 0 && countEvenNumber != 0) {
            for (int i = 0; i < countOddNumber; i++) {
                System.out.println("impar[" + i + "] = " + oddNumber[i]);
            }

            for (int i = 0; i < countEvenNumber; i++) {
                System.out.println("par[" + i + "] = " + evenNumber[i]);
            }
        }

    }

}
