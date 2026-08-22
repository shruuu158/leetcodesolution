class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int result[]=new int[k];
        int index=0;
        for(int i=1;true;i++){
            if(!(list.contains(i))){
                result[index]=i;
                if(index==k-1){
                    break;
                }
                    index++;
            }
        }
            return result[k-1];
    }
}