class Solution {
    public int countHillValley(int[] nums) {
        int cnt=0;
      List<Integer> set=new ArrayList<>();
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
                set.add(nums[i]);
        }
       }
       set.add(nums[nums.length-1]);
       int arr[]=new int[set.size()];
       int index=0;
       for(int ch:set){
        arr[index++]=ch;
       }
       for(int i=1;i<arr.length-1;i++){
        if(arr[i]>arr[i+1] && arr[i]>arr[i-1] || arr[i]<arr[i+1] && arr[i]<arr[i-1] ){
            cnt++;
        }
       }
       return cnt;
    }
}