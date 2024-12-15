import java.util.LinkedList;
import java.util.Queue;

public class NoOfConnectedIsland {
    public static void main(String[] args) {
        int[][] adjmatrix = {{0,1,1,0},{0,1,1,0},{0,0,1,0},{1,0,0,0},{1,1,0,1}};
        int[][] visited = new int[5][4];
        int count = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(visited[i][j] == 0 && adjmatrix[i][j] == 1){
                    count++;
                    bfs(i,j,adjmatrix,visited);
                }
            }
        }
        System.out.println(count);
    }
    private static void bfs (int row, int col, int[][] adj, int [][] vis){
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row,col));
        int n = adj.length;
        int m = adj[0].length;

        while(!q.isEmpty()){
            Pair p = q.poll();

            for (int drow = -1 ; drow <=1 ; drow++){
                for (int dcol = -1 ; dcol <= 1; dcol++){
                    int nrow = p.first + drow;
                    int ncol = p.second + dcol;
                    if(nrow >= 0 && nrow < n 
                    && ncol >= 0 && ncol < m
                    && adj[nrow][ncol] == 1
                    && vis[nrow][ncol] == 0){
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }

    }
}
