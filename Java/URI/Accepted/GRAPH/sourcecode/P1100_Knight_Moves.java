package  URI.Accepted.GRAPH.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1100 Knight Moves https://www.urionlinejudge.com.br/judge/en/problems/view/1100
//Accepted 2/1/16, 10:18:36 PM Runtime:0.196s
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class P1100_Knight_Moves {

    static String[][] chessboard = new String[][]{
        {"a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1"},
        {"a2", "b2", "c2", "d2", "e2", "f2", "g2", "h2"},
        {"a3", "b3", "c3", "d3", "e3", "f3", "g3", "h3"},
        {"a4", "b4", "c4", "d4", "e4", "f4", "g4", "h4"},
        {"a5", "b5", "c5", "d5", "e5", "f5", "g5", "h5"},
        {"a6", "b6", "c6", "d6", "e6", "f6", "g6", "h6"},
        {"a7", "b7", "c7", "d7", "e7", "f7", "g7", "h7"},
        {"a8", "b8", "c8", "d8", "e8", "f8", "g8", "h8"}
    };
    static ArrayList<String> nodeQueue = new ArrayList<String>();
    static ArrayList<String> nextQueue = new ArrayList<String>();
    static ArrayList<String> moved = new ArrayList<String>();
    static String endNode;
    static int move;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while ((input = br.readLine()) != null) {
            String[] st = input.split(" ");
            String startNode = st[0];
            endNode = st[1];
            if (startNode.equals("##") && endNode.equals("##")) {
                break;
            }
            if (startNode.equals(endNode)) {
                bw.append("To get from " + startNode + " to " + endNode + " takes 0 knight moves.\n");
            } else {
                move = 1;
                nodeQueue.add(startNode);
                bw.append("To get from " + startNode + " to " + endNode + " takes " + simulate() + " knight moves.\n");
                nodeQueue.clear();
                nextQueue.clear();
                moved.clear();
            }
//            bw.flush();
        }
        bw.flush();
    }

    static int simulate() {

        while (true) {
            if (nodeQueue.size() == 0) {
                break;
            }
            int queueSize = nodeQueue.size();
            for (int i = 0; i < queueSize; i++) {
                int c = nodeQueue.get(0).charAt(0) - 'a';
                int r = nodeQueue.get(0).charAt(1) - '1';
                moved.add(nodeQueue.get(0));

                //top left
                String top_left = getTop_Left(r, c);
                if (top_left != null) {
                    if (top_left.equals(endNode)) {
                        return move;
                    } else if (!top_left.equals("moved")) {
                        nextQueue.add(top_left);
                    }
                }

                //top right
                String top_right = getTop_Right(r, c);
                if (top_right != null) {
                    if (top_right.equals(endNode)) {
                        return move;
                    } else if (!top_right.equals("moved")) {
                        nextQueue.add(top_right);
                    }
                }

                //Bottom left
                String bottom_left = getBottom_Left(r, c);
                if (bottom_left != null) {
                    if (bottom_left.equals(endNode)) {
                        return move;
                    } else if (!bottom_left.equals("moved")) {
                        nextQueue.add(bottom_left);
                    }
                }

                //Bottom right
                String bottom_right = getBottom_Right(r, c);
                if (bottom_right != null) {
                    if (bottom_right.equals(endNode)) {
                        return move;
                    } else if (!bottom_right.equals("moved")) {
                        nextQueue.add(bottom_right);
                    }
                }

                //Left Top
                String left_top = getLeft_top(r, c);
                if (left_top != null) {
                    if (left_top.equals(endNode)) {
                        return move;
                    } else if (!left_top.equals("moved")) {
                        nextQueue.add(left_top);
                    }
                }

                //Left Bottom
                String left_bottom = getLeft_Bottom(r, c);
                if (left_bottom != null) {
                    if (left_bottom.equals(endNode)) {
                        return move;
                    } else if (!left_bottom.equals("moved")) {
                        nextQueue.add(left_bottom);
                    }
                }

                //right Top
                String right_top = getRight_top(r, c);
                if (right_top != null) {
                    if (right_top.equals(endNode)) {
                        return move;
                    } else if (!right_top.equals("moved")) {
                        nextQueue.add(right_top);
                    }
                }

                //right Bpttom
                String rigth_bottom = getRight_Bottom(r, c);
                if (rigth_bottom != null) {
                    if (rigth_bottom.equals(endNode)) {
                        return move;
                    } else if (!rigth_bottom.equals("moved")) {
                        nextQueue.add(rigth_bottom);
                    }
                }
                nodeQueue.remove(0);
            }
            nodeQueue.addAll(nextQueue);
            nextQueue.clear();
            move++;
        }

        return move;
    }

    static String getTop_Left(int r, int c) {
        r += 2;
        c -= 1;
        if (r <= 7 && c >= 0) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getTop_Right(int r, int c) {
        r += 2;
        c += 1;
        if (r < 8 && c < 8) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getBottom_Left(int r, int c) {
        r -= 2;
        c -= 1;
        if (r >= 0 && c >= 0) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getBottom_Right(int r, int c) {
        r -= 2;
        c += 1;
        if (r >= 0 && c < 8) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getLeft_top(int r, int c) {
        r += 1;
        c -= 2;
        if (r <= 7 && c >= 0) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getLeft_Bottom(int r, int c) {
        r -= 1;
        c -= 2;
        if (r >= 0 && c >= 0) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getRight_top(int r, int c) {
        r += 1;
        c += 2;
        if (r < 8 && c < 8) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

    static String getRight_Bottom(int r, int c) {
        r -= 1;
        c += 2;
        if (r >= 0 && c < 8) {
            String node = chessboard[r][c];
            if (moved.contains(node)) {
                return "moved";
            }
            return node;
        }

        return null;
    }

}
