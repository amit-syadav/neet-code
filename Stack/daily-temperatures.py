"""
First attempt.  Not optimal solution

logic : maintain a hashmap of all the temperatures scanned till now

for every temperature,  iterate over the hashmap keys to search for the nearest greater temperature

return its index - current index

"""



class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]: 

        from collections import defaultdict

        res = [] 
        dt_temp = defaultdict( int)

  

        curr_max = -1
        # prev_temp_list

        for temp_ind in  range(len(temperatures)-1, -1, -1):  # O n
            temp_curr = temperatures[temp_ind]

            # if temp_curr not in dt_temp:
                # prev_temp_list.append(temp_current
            dt_temp[temp_curr] = temp_ind 

            curr_max = max(temp_curr,  curr_max)
            curr_res = 1000000

            if curr_max > temp_curr:
                # find the index of nearest number
                for i in range(temp_curr+1, curr_max+1):
                    if i in dt_temp:
                        curr_res = min(curr_res,  dt_temp[i] - temp_ind)
                        if curr_res == 1:
                            break
                res.append(curr_res)
            else:
                res.append(0) 

        return res[-1::-1]