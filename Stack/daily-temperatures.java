import java.util.List;
import java.util.ArrayList;

class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        ArrayList<Integer> stack = new ArrayList<>();

        int[] result = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            sol(result, temperatures, stack, i);

        }

        return result;

    }

    private void sol(int[] result, int[] temp, ArrayList<Integer> stack, int i_tem) {

        int curr = temp[i_tem];

        // stack is empty
        if (stack.size() == 0) {
            result[i_tem] = 0;
            stack.add(i_tem);
        }

        else if (curr >= temp[stack.get(stack.size() - 1)]) {
            // pop the stk ele
            // find sol with new stak top
            stack.remove(stack.size() - 1);
            sol(result, temp, stack, i_tem);
        }

        else {
            // result is diff of index
            // push curr ele to
            result[i_tem] = stack.get(stack.size() - 1) - i_tem;
            stack.add(i_tem);
        }

    }
}