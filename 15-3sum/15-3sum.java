class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        if(nums.length<3){
            return l;
        }
        Arrays.sort(nums);
        
        for(int i=0;i<=nums.length-3;i++){
            int k=i+1;
            int j=nums.length-1;
            int a=-nums[i];
            while(k<j){
                int sum = nums[k]+nums[j];
                if(sum>a){
                    j--;
                }
                else if(sum<a){
                    k++;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    l.add(list);
                    while(k<j && nums[k]==nums[k+1])k++;
                    while(k<j && nums[j]==nums[j-1])j--;
                    k++;j--;
                    
                }
                while(i<nums.length - 3 && nums[i]==nums[i+1])i++;
            }
            
        }
        return l;
        
    }
}