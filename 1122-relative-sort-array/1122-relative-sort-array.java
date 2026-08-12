import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list= new ArrayList<>();   
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                    if(arr2[i]==arr1[j]){
                        list.add(arr2[i]);
                    }
            }
            
        }

        List<Integer> list2=new ArrayList<>();
        List<Integer> list3=new ArrayList<>();
        for(int num:arr2){
            list2.add(num);
        }
        for(int num:arr1){
            if(!list2.contains(num)){
                   list3.add(num);
            }
        }
        Collections.sort(list3);
        int result[]=new int[arr1.length];
        int i=0;
        for(int num:list){
            result[i++]=num;
        }
         for(int num:list3){
            result[i++]=num;
         }
            return result;
    }
}