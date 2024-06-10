class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        def search(numbers, i,j,other):
            # numbers is sorted

            if i> j  or j>= len(numbers)  or i < 0:
                return -1

            mid = (i+j)//2

            if other == numbers[mid]:
                return mid
            elif other >  numbers[mid]:
                return search(numbers, mid+1  ,j, other)
            elif other < numbers[mid]:
                return search(numbers, i,   mid-1, other)

        for p in range( len(numbers)):

            other  = target - numbers[p]

            ind_other = search(numbers, p+1, len(numbers)-1, other)

            # print( p, numbers[p], ind_other, numbers[ind_other])

            if ind_other != -1:
                break
        
        if ind_other != -1:
            return [p+1, ind_other+1]
        