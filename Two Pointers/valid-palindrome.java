class Solution {
    public boolean isPalindrome(String s) {

 

        List<Character> s_l = new ArrayList<>();

        for(int i=0; i< s.length(); i++){
            if(Character.isAlphabetic( s.charAt(i) )  || Character.isDigit( s.charAt(i)) ){
                s_l.add( Character.toLowerCase(s.charAt(i)) );
            }
        }
     


        for(int i = 0; i < s_l.size()/2; i++){

            if(s_l.get(i)   != s_l.get(s_l.size()-i-1)    ){
                // System.out.println( s_l.get(i)  +" "+ s_l.get(s_l.size()-i-1)   );
                return false;

            }
        }
      return true;
        

    }
}