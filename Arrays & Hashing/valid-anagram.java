class Solution {
    public boolean isAnagram(String s, String t) {
        // create a hash map

        Map<Character, Integer> hm  = new HashMap<>();
        Map<Character, Integer> hm_t  = new HashMap<>();
 
        
        for (char e: s.toCharArray()){
            if( hm.containsKey(e)){
                hm.put(e, hm.get(e)+1);
            } 
            else{
                hm.put(e,1);
            } 
        }

        for (char e: t.toCharArray()){
            if (hm_t.containsKey(e)){
                hm_t.put(e, hm_t.get(e)+1);
            } 
            else{
                hm_t.put(e, 1);
            } 
        }

        return hm.equals(hm_t);
    }
}