class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Set<List<Integer>> set = new LinkedHashSet<>();
        if(nums.length<3){
            return l;
        }
        Arrays.sort(nums);
        
        for(int i=0;i<=nums.length-3;i++){
            int k=i+1;
            int j=nums.length-1;
            System.out.println("1");
            while(k<j){
                if((nums[k]+nums[j])>(-1*nums[i])){
                    j--;
                }
                else if((nums[k]+nums[j])<(-1*nums[i])){
                    k++;
                }
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    //System.out.println(list);
                    set.add(new ArrayList<>(list));
                    //System.out.println(set);
                    list.clear();
                    k++;j--;
                    
                }
            }
            
        }
        l.addAll(set);
        return l;
        
    }
}