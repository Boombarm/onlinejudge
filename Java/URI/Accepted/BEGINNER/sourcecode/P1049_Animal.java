package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1049 Animal https://www.urionlinejudge.com.br/judge/en/problems/view/1049
//Accepted 08/08/2015 - 09:32:17 Runtime:0.052s 
import java.util.Scanner;

public class P1049_Animal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String property1 = sc.next();
        String property2 = sc.next();
        String property3 = sc.next();
        if (property1.equals("vertebrado")) {
            if (property2.equals("ave")) {
                if (property3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (property3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (property2.equals("mamifero")) {
                if (property3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (property3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (property1.equals("invertebrado")) {
            if (property2.equals("inseto")) {
                if (property3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (property3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (property2.equals("anelideo")) {
                if (property3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (property3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }

}
