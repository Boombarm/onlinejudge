package ZOJ.Accepted;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: ZOJ
 * @Problem: 1061 Web Navigation
 * @Link: http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemId=61
 * @Timelimit: 2 Seconds
 * @Status: Accepted
 * @Submission: 2015-06-06 05:43:01
 * @Runtime: 85 ms
 * @Solution:
 * @Note:
 */
import java.util.ArrayList;
import java.util.Scanner;


public class P1061_Web_Navigation {
    
    static ArrayList<String> backwardHistory = new ArrayList<String>();
    static ArrayList<String> forwardHistory = new ArrayList<String>();
    static String curURL = "";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            curURL = "http://www.acm.org/";
            backwardHistory.clear();
            forwardHistory.clear();
            while(true){
                String operation = sc.next();
                boolean ignored = false;
                if(operation.equals("QUIT")){
                    break;
                }
                
                if(operation.equals("VISIT")){
                    visit(sc.next());
                }                    
                else if(operation.equals("BACK")){
                    ignored = backward();
                }
                else if(operation.equals("FORWARD")){
                    ignored = forward();
                }
                
                if(ignored){
                    System.out.println("Ignored");
                }
                else{
                    System.out.println(curURL);
                }
           
            }//end while
            if(n>0){
                System.out.println("");
            }
        }//end for
    }
    
    static int limitBackwardHistory(){
        return backwardHistory.size();
    }
    
    static int limitForwardHistory(){
        return forwardHistory.size();
    }
    
    static void visit(String visitSite){
        backwardHistory.add(curURL);
        curURL = visitSite;
        forwardHistory.clear();
    }
    
    static boolean backward(){
        if(limitBackwardHistory() == 0){
            return true;
        }
        else{
            int lastBackwardIndex = limitBackwardHistory()-1;
            forwardHistory.add(curURL);
            curURL = backwardHistory.get(lastBackwardIndex);
            backwardHistory.remove(lastBackwardIndex);
        }
        return false;
    }
    
    static boolean forward(){
        if(limitForwardHistory() == 0){
            return true;
        }
        else{
            int lastForwardIndex = limitForwardHistory()-1;
            backwardHistory.add(curURL);
            curURL = forwardHistory.get(lastForwardIndex);
            forwardHistory.remove(lastForwardIndex);
        }
        return false;
    }
}

            