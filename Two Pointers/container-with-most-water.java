class Solution {


    public int get_min( int x, int y){
        if (x> y)
            return y;
        else
            return x;


    }
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;
        int max_res = 0;
        int temp_res = 0;
        int min_ele = 0;

        while(left < right){
            min_ele = get_min( height[left], height[right]);

            temp_res = (right- left)*( min_ele );

            // System.out.println("temp res: "+temp_res + " left, right" + left +" "+ right);

            if(temp_res > max_res)
                max_res = temp_res;

            if (height[left]== min_ele)
                left ++;
            else
                right --;
        }
        return max_res;
        
    }
}