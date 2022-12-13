/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 215 Andy's First Dictionary
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1215
 * @Timelimit: 1 sec
 * @Status: Accepted 27/11/2015 - 05:56:13 Runtime:0.116s 
 * @Solution: Binary Tree & InOrder Traversal
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P1215_Andys_First_Dictionary {

    static TreeNode root;
    static TreeNode[] nodeStack;
    static int top;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Pattern p = Pattern.compile("[a-zA-Z]+");
        String line;
        int size = 0;
        while ((line = br.readLine()) != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                insertTreeNode(m.group().toLowerCase());
                size++;
            }
        }

        //InOrder Traversal
        if (root != null) {
            nodeStack = new TreeNode[size];
            top = - 1;
            TreeNode now = root;
            while (!nodeStackEmpty() || now != null) {
                if (now != null) {
                    push(now);
                    now = now.leftChild;
                } else {
                    TreeNode t = pop();
                    bw.write(t.word + "\n");
                    now = t.rightChild;
                }
            }
            bw.flush();
        }
    }

    static class TreeNode {

        private String word;
        private TreeNode leftChild = null;
        private TreeNode rightChild = null;

        public TreeNode(String newWord) {
            this.word = newWord;
        }

        public void setRightChild(TreeNode rightChild) {
            this.rightChild = rightChild;
        }

        public void setLeftChild(TreeNode leftChild) {
            this.leftChild = leftChild;
        }

    }

    static void insertTreeNode(String word) {
        if (root == null) {
            root = new TreeNode(word);
        } else {
            TreeNode current = root;
            while (true) { //brackets! indenting is important for readabilty
                TreeNode parent = current;
                if (current.word.compareTo(word) < 0) {
                    current = current.rightChild;
                    if (current == null) { //we don't have a right node, need to make one
                        current = new TreeNode(word);
                        parent.rightChild = current;
                        break; //we have a new node in "current" that is empty
                    }
                } else if (current.word.compareTo(word) > 0) {
                    current = current.leftChild;
                    if (current == null) { //we don't have a left node, need to make one
                        current = new TreeNode(word);
                        parent.leftChild = current;
                        break;  //we have a new node in "current" that is empty
                    }
                } else {
                    return;
                }
            }
            current.word = word;
        }
    }

    static void push(TreeNode node) {
        top++;
        nodeStack[top] = node;
    }

    static TreeNode pop() {
        TreeNode node = nodeStack[top];
        top--;
        return node;
    }

    private static boolean nodeStackEmpty() {
        return top == -1;
    }

}
