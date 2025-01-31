class adjencyMatrix{
    public static void main(String[] args) {
        int[][] adj = new int[5][5];
        adj[0][1] = 1;
        adj[1][0] = 1;
        adj[1][2] = 1;
        adj[2][1] = 1;
        adj[2][3] = 1;
        adj[3][2] = 1;
        adj[3][4] = 1;
        adj[4][3] = 1;
        adj[4][0] = 1;
        adj[0][4] = 1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }
}