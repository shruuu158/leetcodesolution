class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
               
                shiftarr(arr,i+1);
                arr[i+1]=0;
                i++;
                
                
            }
        }
    }
    public static void shiftarr(int[] arr,int i){
        for(int j=arr.length-2;j>=i;j--){
            arr[j+1]=arr[j];
        }
    }
}