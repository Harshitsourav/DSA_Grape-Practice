import java.util.ArrayList;

public class GraphImplimentation {
    public static void main(String[] args){

        // Adjacency Matrix way to store a Graph
        int n = 3, m = 3;
        int adj[][] = new int [n+1] [n+1];

        //edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2--3
        adj[3][2] = 1;
        adj[2][3] = 1;

        //edge 2--3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // Adjacency List way to store a Graph

        ArrayList <ArrayList<Integer>> adj2 = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++){
            adj2.add(new ArrayList<Integer>());
        }

        //edge 1--2
        adj2.get(1).add(2);
        adj2.get(2).add(1);

        //edge 3--2
        adj2.get(3).add(2);
        adj2.get(2).add(3);

        //edge 1--3
        adj2.get(1).add(3);
        adj2.get(3).add(1);

        for(int i = 1; i <=n; i++){
            for (int j = 0; j < adj2.get(i).size(); j++){
                System.out.print(adj2.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}