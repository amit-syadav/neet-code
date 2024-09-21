class Solution {
    public int evalRPN(String[] tokens) {
        int stack[] = new int[tokens.length];
        int s_i = 0;

        int op1, op2, res;

        for (String ele:  tokens){
            if (ele.equals("+") || ele.equals("-") || ele.equals("*") || ele.equals("/")){
                op1 = stack[s_i-2];
                op2 = stack[s_i -1];
                s_i-=2;

                if (ele.equals("+"))
                    res = op1+op2;
                else if(ele.equals("-"))
                    res = op1- op2;
                else if (ele.equals("*"))
                    res = op1 *op2;
                else
                    res = (int)op1 / op2;
                // System.out.println(" the res is: "+ res);
                stack[s_i]= res;
                s_i++;
            }
            else{
                // System.out.println(" the else case token is: "+ ele);
                stack[s_i]= Integer.parseInt(ele);
                s_i++;
            }
        }
        return stack[0];
    }
}