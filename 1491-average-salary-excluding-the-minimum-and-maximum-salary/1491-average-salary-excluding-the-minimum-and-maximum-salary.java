class Solution {

    public double average(int[] salary) {

        int sum = 0;
        int min = salary[0];
        int max = salary[0];

        for (int i = 0; i < salary.length; i++) {

            sum += salary[i];

            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }
}