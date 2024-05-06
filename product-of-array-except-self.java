class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] mul= new int[nums.length];
        int[] r_mul= new int[nums.length];


        int r_i;

        for (int i=0; i< nums.length; i++){
            if(i == 0) // first ele
                mul[i] = nums[i];
            else
                mul[i] = mul[i-1] * nums[i];

            //  populate rev_mul

            r_i = nums.length-1-i;

            if(r_i== nums.length- 1)
                r_mul[r_i] = nums[r_i];
            else
                r_mul[r_i] = r_mul[r_i+1] * nums[r_i] ;

        }


        
        int[] res= new int[nums.length];

        for (int i=0; i< nums.length; i++){
 

            if(i==0)
                res[i] = r_mul[i+1];
            else if(i==nums.length-1)
                res[i] = mul[i-1];
            
            else
                res[i] = mul[i-1]*r_mul[i+1];

        }


        return res;
        
    }
}