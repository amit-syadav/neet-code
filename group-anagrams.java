class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Map, ArrayList<String> > outer = new HashMap<>();

        for(String s :strs){
            
            Map<Character, Integer> word = new HashMap<>();
            for(Character c : s.toCharArray()){ 
                    word.put(c,   word.get(c) != null ?  word.get(c) +1 : 1 ); 
            } 

            if (outer.containsKey(word)){
                outer.get(word).add(s);
            }
            else{
                ArrayList<String> first_string = new ArrayList<>();

                first_string.add(s);
                outer.put(word,first_string) ;
            }
            
        }

        System.out.println(outer);



        List<List<String>> res = new ArrayList<> ();

        // get all keys of hashmap in java

        for ( ArrayList<String> arr : outer.values()){

            res.add(arr);

        }


        return  res;
    }
}