class Solution {
    public int[] minOperations(String boxes) {
        int a[] = new int[boxes.length()];
        HashMap<Integer, Character> map =new HashMap<>();
        for(int i=0;i<boxes.length();i++){
           if(boxes.charAt(i)=='1'){
                map.put(i, boxes.charAt(i));
           }
        }
        
        for(int i=0;i<boxes.length();i++){
            int count =0;
            for(Map.Entry<Integer, Character> e : map.entrySet()){
                count+=Math.abs(e.getKey()-i);
            }
            a[i]=count;
        }
        return a;
    }
}