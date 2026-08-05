class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++) {
            
            int diff = Math.abs(arr[i] - arr[i + 1]);
            min = Math.min(diff, min);
        }

        for(int i = 0; i < arr.length - 1; i++) {

            if(Math.abs(arr[i] - arr[i + 1]) == min) {

                List<Integer> in = new ArrayList<>();

                in.add(arr[i]);
                in.add(arr[i + 1]);

                list.add(in);
            }
        }

        return list;
    }
}