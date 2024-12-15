import java.util.ArrayList;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int n = 9, m = 9;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i<=n ;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(1).add(3);
        adj.get(3).add(1);

        adj.get(2).add(5);
        adj.get(5).add(2);

        adj.get(2).add(6);
        adj.get(6).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(3).add(7);
        adj.get(7).add(3);

        adj.get(8).add(4);
        adj.get(4).add(8);

        adj.get(8).add(7);
        adj.get(7).add(8);

        

        int vis[] = new int [n+1];
        for(int i = 1; i <=n; i++){
            for (int j = 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println("----------");
        dfs(1, vis, adj);

    }

    private static void dfs(Integer node, int vis[],ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        System.out.print(node+"->");
        for(int it: adj.get(node)){
            if(vis[it] != 1){
                dfs(it,vis,adj);
                
            }
        }
    }

    
}
