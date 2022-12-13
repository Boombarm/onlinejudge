package URI.Accepted.BEGINNER.sourcecode;

/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI ONLINE JUDGE
 * @Categories: BEGINNER
 * @Problem: 2632 - Magic and Sword
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/2632
 * @Timelimit: 1 sec
 * @Status: Accepted
 * @Memory:
 * @Submission: 3/28/18, 1:06:01 AM
 * @Runtime: 0.052s
 * @Solution: check Distance Between Two Points
 * @Note: https://yal.cc/rectangle-circle-intersection-test/
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

class P2632_Magic_and_Sword {

    static final int[] FIRE_RADIUS = new int[]{20, 30, 50};
    static final int[] WATER_RADIUS = new int[]{10, 25, 40};
    static final int[] EARTH_RADIUS = new int[]{25, 55, 70};
    static final int[] AIR_RADIUS = new int[]{18, 38, 60};
    static int FIRE_DAMAGE = 200;
    static int WATER_DAMAGE = 300;
    static int EARTH_DAMAGE = 400;
    static int AIR_DAMAGE = 100;
    static int W, H, X0, Y0;
    static int CX, CY;

    class Enemy {
        int x, y;
        int width, height;
        Point topLeft, topRight, botLeft, botRight;

        public Enemy(int width, int height, int x, int y) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            topLeft = new Point();
            topLeft.x = x;
            topLeft.y = y;

            topRight = new Point();
            topRight.x = x + width;
            topRight.y = y;

            botLeft = new Point();
            botLeft.x = x;
            botLeft.y = y + height;

            botRight = new Point();
            botRight.x = x + width;
            botRight.y = y + height;
        }


    }

    class Point {
        int x, y;
    }

    boolean intersects(Spell circle, Enemy rect) {
        Point pTopleft = rect.topLeft;
        Point pTopRight = rect.topRight;
        Point pBotLeft = rect.botLeft;
        Point pBotRight = rect.botRight;
        int left = pTopleft.x;
        int right = pTopRight.x;
        int top = pTopleft.y;
        int bottom = pBotRight.y;

        if (circle.x >= left && circle.x <= right && circle.y >= top && circle.y <= bottom) {
            return true;
        } else if (circle.x >= left && circle.x <= right) {
            if (circle.y < top && Math.sqrt(pow(circle.x, circle.x) + pow(circle.y, top)) <= circle.radius) {
                return true;
            } else if (circle.y > bottom && Math.sqrt(pow(circle.x, circle.x) + pow(circle.y, bottom)) <= circle.radius) {
                return true;
            }
        } else if (circle.y >= top && circle.y <= bottom) {
            if (circle.x < left && Math.sqrt(pow(circle.y, circle.y) + pow(circle.x, left)) <= circle.radius) {
                return true;
            } else if (circle.x > right && Math.sqrt(pow(circle.y, circle.y) + pow(circle.x, right)) <= circle.radius) {
                return true;
            }
        }

        if (Math.sqrt(pow(circle.x, pTopleft.x) + pow(circle.y, pTopleft.y)) <= circle.radius) {//Check TOP LEFT
            return true;
        }

        if (Math.sqrt(pow(circle.x, pTopRight.x) + pow(circle.y, pTopRight.y)) <= circle.radius) {//Check TOP RIGHT
            return true;
        }

        if (Math.sqrt(pow(circle.x, pBotLeft.x) + pow(circle.y, pBotLeft.y)) <= circle.radius) {//Check BOT LEFT
            return true;
        }

        if (Math.sqrt(pow(circle.x, pBotRight.x) + pow(circle.y, pBotRight.y)) <= circle.radius) {//Check BOT RIGHT
            return true;
        }

        return false;
    }

    int pow(int a, int b) {
        return (int) Math.pow(a - b, 2);
    }

    class Spell {
        int x, y;
        int radius;

        public Spell(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
    }

    public P2632_Magic_and_Sword() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        while (n-- > 0) {
            String[] in = br.readLine().split(" ");
            W = Integer.parseInt(in[0]);
            H = Integer.parseInt(in[1]);
            X0 = Integer.parseInt(in[2]);
            Y0 = Integer.parseInt(in[3]);

            in = br.readLine().split(" ");
            String element = in[0];
            int level = Integer.parseInt(in[1]);
            CX = Integer.parseInt(in[2]);
            CY = Integer.parseInt(in[3]);
            int elementDamange = 0;
            int elementRidius = 0;
            if (element.equals("fire")) {
                elementDamange = FIRE_DAMAGE;
                elementRidius = FIRE_RADIUS[level - 1];
            } else if (element.equals("water")) {
                elementDamange = WATER_DAMAGE;
                elementRidius = WATER_RADIUS[level - 1];
            } else if (element.equals("earth")) {
                elementDamange = EARTH_DAMAGE;
                elementRidius = EARTH_RADIUS[level - 1];
            } else if (element.equals("air")) {
                elementDamange = AIR_DAMAGE;
                elementRidius = AIR_RADIUS[level - 1];
            }
            if (X0 == CX && Y0 == CY) {
                bw.append(elementDamange + "\n");
                continue;
            }
            Enemy enemy = new Enemy(W, H, X0, Y0);
            Spell spell = new Spell(CX, CY, elementRidius);
            bw.append(intersects(spell, enemy) ? elementDamange + "\n" : "0\n");
        }
        bw.flush();
    }

}
