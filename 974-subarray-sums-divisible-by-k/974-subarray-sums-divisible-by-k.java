class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        int s =  0;
         map.put(0,1);
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
            
            s = s%k;
            if(s<0){
                s=s+k;
            }
            //if(map.containsKey(s)){
              //  count+=map.get(s);
            //}
            if(!map.containsKey(s)){
                map.put(s, 1);
                
            }
            else{
                count+=map.get(s);
                int a = map.get(s);
                map.put(s, a+1);
            }
            
            
        }
        return count;
    }
}