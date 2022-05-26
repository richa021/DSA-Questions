class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(check(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean check(char[][] b, String w , int i, int j, int ind){
        if(ind==w.length())
            return true;
        if(i<0 || j<0 || i==b.length || j==b[0].length)
            return false;
        if(b[i][j]!=w.charAt(ind))
            return false;
        char a = b[i][j];
        b[i][j] = '@';
        boolean ans = (check(b,w,i-1,j,ind+1)||check(b,w,i+1,j,ind+1)||check(b,w,i,j-1,ind+1)|| check(b,w,i,j+1,ind+1));
        b[i][j]=a;
        return ans;
            
    }
}