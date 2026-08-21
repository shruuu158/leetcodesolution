class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list=new ArrayList<>();
        // a b b x x x x z y y
        //i
        //   j
        int i=0;
        while(i<s.length()){
            int j=i;
            while(j<s.length() && s.charAt(i)==s.charAt(j)){
                j++;
            }
            int length=j-i;
            if(length>=3){
                List<Integer> list2=new ArrayList<>();
                list2.add(i);
                list2.add(j-1);
                list.add(list2);
            }
            i=j;
        }
      return list;
    }
}