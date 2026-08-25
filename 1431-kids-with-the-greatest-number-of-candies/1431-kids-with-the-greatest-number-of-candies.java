class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> b=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(checkmax(candies[i]+extraCandies,candies)){
                b.add(true);
            }else{
                b.add(false);
            }
        
        }
        return b;
    }
    public static boolean checkmax(int extracandies,int candies[]){
        for(int i=0;i<candies.length;i++){
            if(extracandies<candies[i]){
                return false;
            }
        }
        return true;
    }
}