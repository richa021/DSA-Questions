class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total_sum =0;
        for(int i : cardPoints){
            total_sum+=i;
        }
        int ans = 0, window_sum=0;
        int n = cardPoints.length;
         
        if(k==n) return total_sum;
        
        for(int i=0;i<n-k-1;i++){
            window_sum+=cardPoints[i];
        }
        
        for(int i=n-k-1;i<n;i++){
            window_sum +=cardPoints[i];
            ans = Math.max(ans,  total_sum-window_sum);
            window_sum-=cardPoints[i-(n-k-1)];
        }
        return ans;
    }
}