class Solution {
    public int[] pivotArray(int[] a, int pivot) {
        int[] b = new int[a.length];
        int numPivot=0, j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<pivot){
                b[j]=a[i];
                j++;
            }
            if(a[i]==pivot){
                numPivot++;
            }
        }
        while(numPivot>0){
            b[j]=pivot;
            j++;
            numPivot--;
        }
        
        for(int i=0;i<a.length;i++){
            if(a[i]>pivot){
                b[j]=a[i];
                j++;
            }
        }
        return b;
    }
}