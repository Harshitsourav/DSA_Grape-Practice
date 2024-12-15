/*
547. Number of Provinces

There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces. */

import java.util.ArrayList;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        int size = isConnected.length;
        int vis[] = new int [size];
        int count = 0;

        for(int i = 0; i < size; i++){
            adj.add(new ArrayList<Integer>());
        }
        for (int i = 0 ;i < size; i++){
            for (int j = 0; j < size; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                }
            }
        }
        for (int i = 0; i < size; i++){
            if(vis[i] != 1){
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
    private void dfs(int i, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[i] = 1;
        for (Integer it: adj.get(i)){
            if(vis[it] == 0){
                dfs(it, adj, vis);
            }
        }
    }
}