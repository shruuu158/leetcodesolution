class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
              String s=String.valueOf(nums[i]);
              for(int j=0;j<s.length();j++){
                int digit=s.charAt(j)-'0';
                list.add(digit);
              }
            }
            else{
                list.add(nums[i]);
            }
        }
        int result[]=new int[list.size()];
        int i=0;
        for(int n:list){
            result[i++]=n;
        }
        return result;
    }
}