class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        
        List<List<Integer>> final_res = new ArrayList<>();
         

        Arrays.sort(nums);  

        List<List<Integer>> method_twoSum;



        int p,q,r, target;

        for( int i=0; i< nums.length && nums[i] <= 0; i++){
            if (i>0 && nums[i] == nums[i-1] ){
                continue;
            }
            target = -1* nums[i]; 

            // find neg of target in the remaining array 
            method_twoSum = twoSum(target, nums,  i+1, nums.length-1);

            // sol may or may not exists

            if(method_twoSum.size()!=0 ){ 

                for(List<Integer> inner_res :  method_twoSum ){
                    inner_res.add(nums[i]);
                    final_res.add(inner_res); 
                }
            }

        }
        // System.out.println(final_res);

            // return   new ArrayList<List<Integer>> (new HashSet<List<Integer>>(final_res)); 
            return  final_res;// new ArrayList<List<Integer>> (new HashSet<List<Integer>>(final_res)); 

        
    }

    public static List<List<Integer>>  twoSum(int target, int[] numbers, int i, int j){
        List<List<Integer>> final_res  = new ArrayList<>();
        

        while(i<j){
            List<Integer> res  = new ArrayList<>();

            if(numbers[i] + numbers[j]== target){
                res.add(numbers[i]);
                res.add(numbers[j--]);

                final_res.add(res);

                while(i< numbers.length && numbers[i-1] == numbers[i]){
                    i++;
                }
                
                while(j>-1  && numbers[j] == numbers[j+1]){
                    j--;
                }
            }
            else if ( numbers[i]+ numbers[j] < target){
                i++;
            }
            else{
                j--;
            }
        }

        // System.out.println(final_res);

        return final_res;

    }

}