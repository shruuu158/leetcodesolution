class Solution {
    public int countSeniors(String[] details) {
        int cnt=0;
     for(int i=0;i<details.length;i++){
        String s=details[i];
        int number1 = s.charAt(11) - '0';
         int number2 = s.charAt(12) - '0';

        int age = number1 * 10 + number2;
   
        if(age>60){
            cnt++;
        }
     }   
     return cnt;
    }
}