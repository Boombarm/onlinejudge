import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.HashMap;

public class P1799_The_Rat_in_a_Maze {
	
	static int[] V;
	static HashMap<String, Node> map;
	
	static class Node {
		int id;
		String name;
		LinkedList<Node> connection;
		
		public Node(String name, int id){
			this.name = name;
			this.id = id;
			this.connection = new LinkedList();
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = br.readLine().split(" ");
		int point = Integer.parseInt(in[0]);
		int link = Integer.parseInt(in[1]);
		map = new HashMap();
		
		int id = 0;
		for(int i = 0; i < link; i++){
			in = br.readLine().split(" ");
			String a = in[0];
			String b = in[1];
			
			Node nodeA = map.get(a);
			Node nodeB = map.get(b);
			if(nodeA == null){
				nodeA = new Node(a, id++);
			}
			if(nodeB == null){
				nodeB = new Node(b, id++);
			}
			
			nodeA.connection.add(nodeB);
			nodeB.connection.add(nodeA);
			
			map.put(a, nodeA);
			map.put(b, nodeB);
		}
		
		Node start = map.get("*");
		LinkedList<Node> Q = new LinkedList<Node>();
		LinkedList<Node> nextQ = new LinkedList<Node>();
		nextQ.add(start);
		V = new int[point+1];
		V[start.id] = 1;
		
		int moveCount = 0;
		int sRange = 0;
		int eRange = 0;
		loop: while(!nextQ.isEmpty()){
			Q.addAll(nextQ);
			nextQ = new LinkedList<Node>();
			while(!Q.isEmpty()){
				Node cur = Q.poll();
				if(sRange == 0 && cur.name.equals("Entrada")){
					sRange = moveCount;
					if(eRange != 0){
						break loop;
					}
				}
				if(eRange == 0 && cur.name.equals("Saida")){
					eRange = moveCount;
					if(sRange != 0){
						break loop;
					}
				}
				
				for(Node node : cur.connection){
					if(V[node.id] == 0){
						V[node.id] = 1;
						nextQ.add(node);
					}
				}
			}
			moveCount++;
		}
		
		System.out.println(sRange + eRange);
		
	}
	
}