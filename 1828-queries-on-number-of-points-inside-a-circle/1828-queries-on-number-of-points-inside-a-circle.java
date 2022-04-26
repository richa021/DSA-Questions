class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];
            int count=0;
            for(int j=0;j<points.length;j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                if((Math.pow(x-x2,2)+Math.pow(y-y2,2)) <= Math.pow(r,2)){
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}