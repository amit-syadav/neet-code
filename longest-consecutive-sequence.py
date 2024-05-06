class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:

        def search( ele, nums, ct):
            if ele in nums  :
                ct+=1 
                return search(ele-1, nums, ct)

            else:
                return ct

        def fw_search( ele, nums, ct):
            if ele in nums  :
                nums.remove(ele)
                ct+=1 
                return fw_search(ele+1, nums, ct)

            else:
                return ct

        nums = set(nums) # to eleminate duplicates
        bw_ct = 0
        fw_ct = 0
        curr_max = 0


        if len(nums)==0:
            min_ele = -9999999999
        else:
            min_ele = min(nums)
 

 
        while len(nums)!=0: 
                # seach all its -1 elements
            ele = nums.pop()

            bw_ct = search(ele-1,nums, 1)
            fw_ct = fw_search(ele+1,nums,0)
            curr_max = max(curr_max, bw_ct + fw_ct)


            min_ele = min_ele + bw_ct + fw_ct+1

        
        return curr_max