class Solution { 
    public boolean threeConsecutiveOdds(int[] arr) { 

        for(int i = 0; i <= arr.length - 3; i++) { 

            int j = i + 3 - 1; 

            if(odd(arr, i, j)) { 
                return true; 
            } 
        } 

        return false; 
    } 

    public static boolean odd(int[] arr, int i, int j) { 

        boolean yes = true; 

        for(int k = i; k <= j; k++) { 

            if(arr[k] % 2 == 0) { 
                yes = false; 
            } 
        } 

        return yes; 
    } 
}