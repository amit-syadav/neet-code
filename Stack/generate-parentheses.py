class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        arr = ['(']
        check = [(n-1, 1)]

        i = (2*n) -1 
        
        while i > 0:
            temp_arr = []
            temp_check = []
            # print(f'iter {i}')

            for j in range(len(arr)):
                op , cl = check[j]
                curr_str = arr[j]
                
                # print(f'\titer {j}, Curr string {curr_str}, op/cl ({op},{cl}) ')

                if op > 0 :
                    temp_arr.append( curr_str+'(' ) 
                    temp_check.append((op-1, cl+1))
                
                if cl > 0:
                    temp_arr.append( curr_str+')' ) 
                    temp_check.append((op, cl-1))

            arr = temp_arr
            check = temp_check

            i -=1
        
        return arr


        