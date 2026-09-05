class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int k=0;
        String result[]=new String[names.length];
        int height[]=heights.clone();
         Arrays.sort(height);
         for(int i=height.length-1;i>=0;i--){
            for(int j=0;j<heights.length;j++){
                if(height[i]==heights[j]){
                result[k]=names[j];
                k++;
                        break;
                }
            }
         }
            return result;
         

    }
}