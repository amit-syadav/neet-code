class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create a set
        // or create a hashmap
        
        Set<Integer> set = new HashSet<>();

        for(int ele : nums){
            set.add(ele);
        }

        return set.size()!= nums.length;
    }
}