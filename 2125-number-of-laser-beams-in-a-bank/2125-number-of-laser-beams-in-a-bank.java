class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        int beams=0;
        for(int i=0;i<bank.length;i++){
            int c=countbits(bank[i]);
            if(c!=0){
                list.add(c);
            }
        }
        
        for(int i=0;i<list.size()-1;i++){
            beams+=(list.get(i) * list.get(i+1));
        }
        
        return beams;
    }
    
    public int countbits(String s){
        int count=0;
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='1')
                count++;
        }
        return count;
    }
}