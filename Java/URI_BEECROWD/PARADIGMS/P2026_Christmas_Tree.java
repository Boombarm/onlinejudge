import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2026_Christmas_Tree {
	
	static int N,W;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		try{
		int T = Integer.parseInt(br.readLine());
		for(int t =1; t <= T; t++){
			N = Integer.parseInt(br.readLine());
			W = Integer.parseInt(br.readLine());
			int[] o = new int[N+1];
			int[] w = new int[N+1];
			for(int i = 1; i <= N ; i++){
				String[] st = br.readLine().split(" ");
				o[i] = Integer.parseInt(st[0]);
				w[i] = Integer.parseInt(st[1]);
			}
			
			int answer = knapsack_value(o,w,W);
			bw.append("Galho "+t+":\n");
			bw.append("Numero total de enfeites: "+answer+"\n\n");
		}
		bw.flush();
		}catch(IOException e){ }
		
	}
	
	static int knapsack_value(int[] o,int[] w, int W){
		int[][] V = new int[N+1][W+1];
		for(int i = 0; i <= N; i++) 
			V[i][0] =0;
			
		for(int i = 1; i <= W ; i++)
			V[0][i] = 0;
			
		for(int i = 1; i <= N; i++){
			for(int j = 1; j <= W; j++){
				if( j < w[i]){
					V[i][j] = V[i-1][j];
				}else {
					V[i][j] = Math.max(V[i-1][j], o[i]+V[i-1][j-w[i]]);
				}			
			}
		}
		return V[N][W];
	}
	
}