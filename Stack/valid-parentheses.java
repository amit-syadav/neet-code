class Solution {
    public char opp_of(char c){
        if (c==')') 
            return '(';
        else if (c=='}')
            return '{';

        else return '[';
    }

    public boolean isValid(String s) {
        // make a char array of the string

        char[] s_chr = s.toCharArray();
        char[] stack = new char[s_chr.length];
        int stack_i = 0;

        for(int i= 0; i< s_chr.length; i++){
            if (s_chr[i] == '(' || s_chr[i] == '{' || s_chr[i] == '['){
                stack[stack_i ++] = s_chr[i];
                 
            }
            else{
                if (stack_i == 0 ||  stack[stack_i-1] != opp_of(s_chr[i])){
                    return false;
                }
                else{
                    stack_i--;
                }
            }
        }

        if (stack_i == 0)
            return true;
        else 
            return false;

    }
}