class Solution {
    public double average(int[] salary) {
    int sum=0;
    double average=0;
    Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++){
             sum+=salary[i];
        }
        average=(double)sum/(salary.length-2);
        return average;
    }
}