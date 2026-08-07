class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list=new ArrayList<>();
        int n=arr.length-1;//4-3
        //3 2 4 1
        //      i
        for(int i=n;i>0;i--){
            int maxindex=maxIndex(arr,i);//arr,3
                //2
            if(maxindex==i){
                continue;
            }
            if(maxindex!=0){
                //  3 2 4 1       3
                flip(arr,maxindex+1);//4 2 3 1
                list.add(maxindex+1);
            }
                flip(arr,i+1);//1 3 2 4
                list.add(i+1);
        }
        return list;
    }
    public static int maxIndex(int []arr,int right){
        //3 2 4 1
        //0 1 2 3
        int max=0,result=0;
        for(int i=0;i<=right;i++){
            if(max<arr[i]){
                max=arr[i];
                result=i;
            }

        }
        return result;
    }
    public static void flip(int arr[],int r){
       int i=0;
       int j=r-1;
       while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
       }
    }
}