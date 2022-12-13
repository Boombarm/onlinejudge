/**
 * @author Teerapat Phokhonwong
 * @Onlinejudge: URI Online Judge
 * @Problem: 1523 Linear Parking Lot
 * @Link: https://www.urionlinejudge.com.br/judge/en/problems/view/1523
 * @Timelimit: 1 sec
 * @Status: Accepted 24/12/2015 - 11:01:37 Runtime:0.144s
 * @Solution: PriorityQueue + Stack
 */
package  URI.Accepted.DATA_STRUCTURES_AND_LIBRARIES.sourcecode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class P1523_Linear_Parking_Lot {

    static class Car {

        int arrival, exit;
    }
    static int n, k;
    static int front;
    static LinkedList<Car> cars;
    static PriorityQueue<Integer> fristOut;
    static Stack<Integer> parking;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input;
        while (!(input = br.readLine()).equals("0 0")) {
            String[] st = input.split(" ");
            n = Integer.parseInt(st[0]);
            k = Integer.parseInt(st[1]);
            front = -1;
            fristOut = new PriorityQueue();
            cars = new LinkedList();
            parking = new Stack();
            boolean isPossible = true;
            int time = 1;
            int i = 0;
            do {
                st = br.readLine().split(" ");
                int arrival = Integer.parseInt(st[0]);
                int exit = Integer.parseInt(st[1]);
                if (arrival == time) {
                    if (parking.size() == k) {
                        isPossible = false;
                        break;
                    }
                    comming(exit);
                } else {
                    Car car = new Car();
                    car.arrival = arrival;
                    car.exit = exit;
                    cars.add(car);
                }
            } while (++i < n);

            while (isPossible && (!cars.isEmpty() || !parking.isEmpty())) {
                if (!parking.isEmpty() && time == fristOut.peek()) {
                    fristOut.poll();
                    boolean remove = false;
                    while (!parking.isEmpty() && parking.peek() == time) {
                        parking.pop();
                        remove = true;
                    }
                    if (!remove) {
                        isPossible = false;
                        break;
                    }
                }
                while (!cars.isEmpty() && time == cars.peekFirst().arrival) {
                    if (parking.size() == k) {
                        isPossible = false;
                        break;
                    }
                    comming(cars.remove().exit);
                }
                time++;

            }

            bw.append(isPossible ? "Sim\n" : "Nao\n");

        }

        bw.flush();
    }

    static void comming(int exitTime) {
        parking.add(exitTime);
        fristOut.add(exitTime);
    }
}
