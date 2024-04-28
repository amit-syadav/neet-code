class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
        // traverse the array 
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int ele : nums){
            // add elements in hashmap
                map.put(ele,   map.getOrDefault(ele, 0)+1);
        } 
        // traverse the hash map



        List<Integer> values = new ArrayList<>(map.values());

        int max_value = Collections.max(values);

        ArrayList<Integer>[] value_counter = new ArrayList[max_value+1];
   
        for(Integer key : map.keySet()){

            if (value_counter[map.get(key)] == null ) {

                value_counter[map.get(key)]  = new ArrayList<Integer>();
            }

            value_counter[map.get(key)].add(key);
        } 


        List<Integer> res = new ArrayList<>();


        for(int i = value_counter.length-1 ; i>= 0; i--){

            if(value_counter[i] != null){

                ArrayList<Integer> inner_arr=  value_counter[i];
            
                for(Integer ele: inner_arr){
                        res.add(ele);
                        k-=1;
                    }
                 }

                if(k==0){
                    break;
                }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
        // find two largest values wale keys
    }
}