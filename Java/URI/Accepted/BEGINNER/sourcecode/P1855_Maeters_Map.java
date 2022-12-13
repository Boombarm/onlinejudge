package  URI.Accepted.BEGINNER.sourcecode;

/**
 *
 * @author Teerapat Phokhonwong
 */
//URI Online Judge | 1855 Maeter's Map https://www.urionlinejudge.com.br/judge/en/problems/view/1855
//Accepted 09/09/2015 - 08:28:05 Runtime:0.072s
import java.util.Scanner;

public class P1855_Maeters_Map {

    static char[][] map;
    static int w, h;
    static int indexRow, indexColum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        w = sc.nextInt();
        h = sc.nextInt();
        map = new char[h][w];
        for (int i = 0; i < h; i++) {
            String line = sc.next();
            for (int j = 0; j < w; j++) {
                map[i][j] = line.charAt(j);
            }
        }

        char event = ' ';
        //travel
        if (map[0][0] == '*') {
            System.out.println("*");
        } else if (map[0][0] == '.' || map[0][0] == '<' || map[0][0] == '^') {
            System.out.println("!");
        } else if (map[0][0] == '>') {
            event = moveRight(0, 1);
        } else if (map[0][0] == 'v') {
            event = moveDown(0, 1);
        }

        while (true) {

            if (event == '^') {
                event = moveUp(indexRow - 1, indexColum);
            } else if (event == 'v') {
                event = moveDown(indexRow + 1, indexColum);
            } else if (event == '<') {
                event = moveLeft(indexRow, indexColum - 1);
            } else if (event == '>') {
                event = moveRight(indexRow, indexColum + 1);
            }

        }
    }

    static char moveLeft(int row, int colum) {
        for (int i = colum; i >= 0; i--) {
            if (map[row][i] == '<') {
                continue;
            }

            if (map[row][i] == '*') {
                System.out.println("*");
                System.exit(0);
            }
            if (map[row][i] == '>') {
                System.out.println("!");
                System.exit(0);
            }
            if (map[row][i] == 'v') {
                if (row == 0 && i == 0 || row == h - 1) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = row;
                indexColum = i;
                return 'v';
            } else if (map[row][i] == '^') {
                indexRow = row;
                indexColum = i;
                return '^';
            }
        }
        System.out.println("!");
        System.exit(0);
        return ' ';
    }

    static char moveRight(int row, int colum) {
        for (int i = colum; i < w; i++) {
            if (map[row][i] == '>') {
                continue;
            }

            if (map[row][i] == '*') {
                System.out.println("*");
                System.exit(0);
            } else if (map[row][i] == '<') {
                System.out.println("!");
                System.exit(0);
            } else if (map[row][i] == 'v') {
                if (row == h - 1) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = row;
                indexColum = i;
                return 'v';
            } else if (map[row][i] == '^') {
                if (row == 0) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = row;
                indexColum = i;
                return '^';
            }
        }
        System.out.println("!");
        System.exit(0);
        return ' ';
    }

    static char moveUp(int row, int colum) {
        for (int i = row; i >= 0; i--) {
            if (map[i][colum] == '^') {
                continue;
            }

            if (map[i][colum] == '*') {
                System.out.println("*");
                System.exit(0);
            }

            if (map[i][colum] == 'v') {
                System.out.println("!");
                System.exit(0);
            } else if (map[i][colum] == '<') {
                if (colum == 0) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = i;
                indexColum = colum;
                return '<';
            } else if (map[i][colum] == '>') {
                if (i == 0 && colum == 0 || colum == w - 1) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = i;
                indexColum = colum;
                return '>';
            }
        }
        System.out.println("!");
        System.exit(0);
        return ' ';
    }

    static char moveDown(int row, int colum) {
        for (int i = row; i < h; i++) {
            if (map[i][colum] == 'v') {
                continue;
            }

            if (map[i][colum] == '*') {
                System.out.println("*");
                System.exit(0);
            } else if (map[i][colum] == '^') {
                System.out.println("!");
                System.exit(0);
            } else if (map[i][colum] == '<') {
                if (colum == 0) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = i;
                indexColum = colum;
                return '<';
            } else if (map[i][colum] == '>') {
                if (colum == w - 1) {
                    System.out.println("!");
                    System.exit(0);
                }
                indexRow = i;
                indexColum = colum;
                return '>';
            }
        }
        System.out.println("!");
        System.exit(0);
        return ' ';
    }

}
