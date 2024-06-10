class Solution {

    public String encode(List<String> strs) {
        String final_str= "";    
        for( String s: strs){
            final_str = final_str + s + "<?:>"  ;  
            
        }

        return final_str;

    }

    public List<String> decode(String str) {

        String[] s = str.split("<\\?\\:>",-1);
        
        String[] s_new = new String[s.length-1];

        for (int i=0; i< s.length-1; i++){
            s_new[i]=  s[i];
        }

        return Arrays.asList(s_new);


    }
}
