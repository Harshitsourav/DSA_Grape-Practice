import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        int n = 9, m = 9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<=n ;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(6);
        adj.get(6).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(5).add(4);
        adj.get(4).add(5);

        adj.get(5).add(8);
        adj.get(8).add(5);

        adj.get(7).add(8);
        adj.get(8).add(7);

        adj.get(7).add(6);
        adj.get(6).add(7);
        
        adj.get(9).add(6);
        adj.get(6).add(9);

        int vis[] = new int[n+1];
        Queue <Integer> q = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<Integer>();

        q.add(1);
        vis[1] = 1;

        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);
            for (Integer it: adj.get(node)){
                if(vis[it] == 0){
                    vis[it] = 1;
                    q.add(it);
                }
            }
        }
        System.out.println(bfs);

    }
}
