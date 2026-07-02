class Solution {

    public boolean dfs(int u,List<List<Integer>> adj, boolean[] onstack,  boolean[] visited){

        visited[u] = true;
        onstack[u] = true;


        for(Integer v : adj.get(u)){
            
            if(onstack[v] == true){
                return true;
            }

            if(visited[v] == false){
                if(dfs(v, adj, onstack, visited)){
                    return true;
                }
            }

        }

        onstack[u] = false;
        return false;
        

    }


    public boolean canFinish(int numCourses, int[][] prerequisites) { 

                int n = prerequisites.length;

                List<List<Integer>> adj = new ArrayList<>();

                for(int i=0; i<numCourses; i++){

                    adj.add(new ArrayList<>());
                }

                for(int i=0; i<n; i++){
                    int v = prerequisites[i][0];
                    int u = prerequisites[i][1];
                    adj.get(u).add(v);
                }

                boolean[] visited = new boolean[numCourses];
                boolean[] onstack = new boolean[numCourses];

                for(int i=0; i<numCourses; i++){
                    if(visited[i] == false){
                        if(dfs(i, adj, onstack, visited)){
                            return false;
                        }
                    }
                }

                return true;

               
    }
}
