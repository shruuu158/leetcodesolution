class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        for(String word : words) {
            String wor="";
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)==separator){
                    wor+=' ';
                }else{
                    wor+=word.charAt(i);
                }
            }
            
            String str[] = wor.split(" ");

            for(String st : str) {

                if(!(st.isEmpty())) {
                    result.add(st);
                }
            }
        }

        return result;
    }
}