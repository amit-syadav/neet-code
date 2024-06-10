class Solution {
    public int longestConsecutive(int[] nums) {


        Integer[] bucket = new Integer[nums.length];

        for (int i = 0; i< nums.length ; i++){
            // bucket[i] = Integer.valueOf( nums[i] );
            bucket[i] = Integer.valueOf(nums[i]) ;
        }

        // FOR ALL ELEME
            // SKIP IF PREV EXISTS
            // ELSE CHECK HOW MANY CONSEQUTIVE EXISTS

        Set<Integer> set =  new HashSet<>(Arrays.asList(bucket)); // hashset constructor accepts a list type 
// converting it into a list is  a On operation 
// Arrays.asList is a O1 operation because it simply provides a wrapper to the array , its an object of type arrays.arraylist not the utils.arraylist . a list of array.arraylist cannot be extended by adding or deleting more records, we should convert it to utils. arraylist 

        int max = 0;
        int curr_max=0;

        for (Integer ele : set){
            curr_max =0;
           if (set.contains(ele-1)){ // if prev ele exists
                continue;// we will start checking from the first ele onwards

            }
            else{
                while(set.contains(ele)){
                    curr_max ++;
                    ele ++;
                    
                }
                max = Math.max(curr_max, max);
            }
        }
        return max;
    }
}