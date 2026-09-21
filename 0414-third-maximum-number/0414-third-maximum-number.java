class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
      HashSet<Integer> set=new HashSet<>();
      for(int n:nums){
        set.add(n);
      }
      int arr[]=new int[set.size()];
      int i=0;
      for(int n:set){
        arr[i++]=n;
      }
        Arrays.sort(arr);
      if(set.size()<=2){
        return arr[arr.length-1];
      }
      return arr[arr.length-3];
    }
}