from collections import defaultdict


class Solution:
    def trap(self, height: List[int]) -> int:
        
        # def get_ind( ind, val, left,right):
        # # def get_ind( ind, val, left,right, i, j):
        #     # mid = (0+len(ind[val]-1))//2
            
        #     # if ind[val] >= left and ind[val]<= right:
        #     #     return i
        #     # else

        #     for i in ind[val]:
        #         if i >= left and i<= right:
        #             return i


        def water_formula(left, right, middle):
            if height[middle] > min(height[left], height[right]):
                # print('middle is peak, no water stored')
                return 0
            else:
                res = (min(height[left], height[right]) - height[middle]) * (right-left-1)
                # print(res)
                return res

        def find_max(height,left , right):
            v_max = -1
            i_max = -1

            for i in range(left, right):
                if height[i] > v_max:
                    i_max = i
                    v_max = height[i]
            return i_max



        def calc_water(left, right):
            if right - left <= 1 or left >= right:
                return 0
            
            if left+1==right-1:
                return water_formula(left, right, left+1 )
            else:
                middle_i = find_max(height,left+1, right )
                # middle_i =  get_ind(ind,middle,left+1, right-1)
                # print('in range of {} {} the max height is {}'.format(left+1 , right-1,middle))

            return water_formula(left, right, middle_i) + calc_water(left,middle_i)+calc_water(middle_i,right)




        # ind = defaultdict(list)


        # for i in range(len(height)):
        #     ind[height[i] ].append(i)


        water = 0
        left = 0
        right = len(height)-1
        rainwater = 0


        return calc_water(left, right)
