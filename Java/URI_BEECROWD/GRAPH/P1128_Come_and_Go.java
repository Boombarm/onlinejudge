import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.LinkedList;

public class P1128_Come_and_Go {

	static int N, M, V, W, P;

	static class Node {
		int[] visited;
		LinkedList<Node> connection;
		int id;
		int count = 0;
		public Node(int id, int N) {
			this.visited = new int[N+1];
			this.connection = new LinkedList<Node>();
			this.id = id;
		}
	
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String rl = "";

		while (!(rl = br.readLine()).equals("0 0")) {
			String[] in = rl.split(" ");
			N = Integer.parseInt(in[0]);
			M = Integer.parseInt(in[1]);
			Node[] node = new Node[N + 1];

			for (int i = 1; i <= N; i++) {
				node[i] = new Node(i, N);
			}

			for (int i = 0; i < M; i++) {
				in = br.readLine().split(" ");
				V = Integer.parseInt(in[0]);
				W = Integer.parseInt(in[1]);
				P = Integer.parseInt(in[2]);
				node[V].connection.add(node[W]);
				if (P == 2) {
					node[W].connection.add(node[V]);
				}
			}

			int answer = 1;
			for (int i = 1; i <= N; i++) {
				LinkedList<Node> Q = new LinkedList<Node>();
				Q.add(node[i]);
				while (!Q.isEmpty()) {
					Node cur = Q.poll();
					if (node[i].visited[cur.id] == 0) {
						node[i].visited[cur.id] = 1;
						node[i].count++;
						for (Node con : cur.connection) {
							if (node[i].visited[con.id] == 0) {
								Q.add(con);
							}
						}
					}
				}
				if (node[i].count < N) {
					answer = 0;
					break;
				}
			}
			bw.write(answer + "\n");
		}
		bw.flush();
	}
}