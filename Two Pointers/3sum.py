class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        hm = {}

# O nlogn  
        nums.sort()


# On
        for i in range(len(nums)-1,-1,-1):
            if nums[i] not in hm:
                hm[nums[i]] = i
 
        res = []

        i = 0
        j = 1
# On^2
        while i < len(nums) and nums[i] <= 0:
            if i-1>=0 and nums[i] == nums[i-1]: 
                i = hm[nums[i]] +1
                continue

            j = i+1
            while j <  len(nums) :
                if j-1>i and nums[j] == nums[j-1]: 
                    j = hm[nums[j]] +1
                    continue
                target = - 1 * ( nums[i] + nums[j]  )

                if target in hm  and hm[target] > j: 
 
                    res.append( [nums[i],nums[j],target] )

                j +=1
                
            i+=1


        return res


                
        

        