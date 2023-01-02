package ZOJ;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 3782 Ternary Calculation
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=5269
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-06-07 04:15:37
 * @Runtime: 136 ms
 * @Solution:
 * @Note:
 */
import java.util.Scanner;

public class P3782_Ternary_Calculation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int number1 = sc.nextInt();
            String operator1 = sc.next();
            int number2 = sc.nextInt();
            String operator2 = sc.next();
            int number3 = sc.nextInt();
            int answer = 0;
            if(operator1.equals("*") || operator1.equals("/") || operator1.equals("%")){
                switch(operator1){
                    case("*"): answer=number1*number2;
                        break;
                    case("/"): answer=number1/number2;
                        break;
                    case("%"):answer=number1%number2;
                        break;
                }
                switch(operator2){
                    case("+"): answer = answer+number3;
                        break;
                    case("-"): answer = answer-number3;
                        break;
                    case("*"): answer = answer*number3;
                        break;
                    case("/"): answer = answer/number3;
                        break;
                    case("%"):answer = answer%number3;
                        break;
                }
            }
            else if(operator2.equals("*") || operator2.equals("/") || operator2.equals("%")){
                switch(operator2){
                    case("*"): answer=number2*number3;
                        break;
                    case("/"): answer=number2/number3;
                        break;
                    case("%"):answer=number2%number3;
                        break;
                }
                switch(operator1){
                    case("+"): answer = number1+answer;
                        break;
                    case("-"): answer = number1-answer;
                        break;
                }
            }
            else{
                switch(operator1){
                    case("+"): answer = number1+number2;
                        break;
                    case("-"): answer = number1-number2;
                        break;
                }
                switch(operator2){
                    case("+"): answer = answer+number3;
                        break;
                    case("-"): answer = answer-number3;
                        break;
                }
            }
            System.out.println(answer);           
        }
    }


}
