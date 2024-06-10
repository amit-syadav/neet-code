class Solution:
    def isValid(self, s: str) -> bool:

        def opposite_of(chr):
            if chr == ')':
                return '('
            elif chr == ']':
                return '['
            else:
                return '{'
         
        stack = []
        
        if len(s)==1 or len(s)%2 != 0:
            return False
        

        for i in range(len(s) ):
            # if next is open add it
            if s[i] in ('(', '[', '{'):
                stack.append(s[i])
            # if next is closing, then it should be last opened

            else:
                if len(stack)==0 or stack.pop() != opposite_of( s[i] ) :
                    # print('returing false')
                    return False

            # print(f'{s[i]} := {stack}')


        if len(stack)== 0:
            return True
        else:
            return False
