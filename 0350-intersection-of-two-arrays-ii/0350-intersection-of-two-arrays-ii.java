class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list= new LinkedList<>();
        int no1[],no2[];
        if(nums1.length>nums2.length){
            no1=nums1;
            no2=nums2;
        }else{
            no1=nums2;
            no2=nums1;
        }
        for(int i=0;i<no1.length;i++){
            for(int j=0;j<no2.length;j++){
                if(no1[i]==no2[j]){
                    list.add(no1[i]);
                    no2[j]=-1;
                    break;
                }
            }
        }
        int k=0;
        int result[]=new int[list.size()];
        for(int l:list){
            result[k++]=l;
        }
        return result;
    }
}