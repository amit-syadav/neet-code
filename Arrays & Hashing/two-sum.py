class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        # // search for a number in a sorted array
        def search(ele,lst, i,j):

            if 0> i or j >= len(nums) or i>j:
                return -1

            n = (i+j)//2

            if ele == lst[n]:
                return n

            if ele < lst[n]:
                return search(ele, lst,i,n-1)
            else:
                return search(ele, lst,n+1, j)
                
        
        # nlogn

        og_nums = nums.copy()
        og_rev = nums.copy()[-1:-len(nums)-1:-1]

        nums.sort() 

        res = []
        final_res = []


        for i in range( len(nums)):
            j = search( target-nums[i],  nums, i+1, len(nums)-1)
            if j !=-1:
                res.append(i)
                res.append(j)
                break

        if len(res) != 0:
            # map og indices

            final_res.append(og_nums.index(nums[res.pop()]))
            final_res.append(len(nums) - 1-  og_rev.index(nums[res.pop()]))
        return final_res






        