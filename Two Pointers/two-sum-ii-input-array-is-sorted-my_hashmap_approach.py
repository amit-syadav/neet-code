class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        lookup_hashmap = {}

        for p in range(len(numbers)):
            if numbers[p] in lookup_hashmap:
                lookup_hashmap[ numbers[p] ].append(p)
            else :
                lookup_hashmap[ numbers[p] ] = [p]
        # print(lookup_hashmap)


        def lookup(lookup_hashmap,other, ind_p):
            # numbers is sorted
            if other not in lookup_hashmap:
                return -1

            else :
                ind_other = lookup_hashmap[other]

                for inds in ind_other:
                    if inds != ind_p:
                        return inds


        for ind_p in range( len(numbers)):

            other  = target - numbers[ind_p]

            # print(other)

            if other == numbers[ind_p] and len( lookup_hashmap[other]) ==1:  # ele to find is same as the curr element
                continue

            else :
                ind_other = lookup(lookup_hashmap, other , ind_p)

            # print( p, numbers[p], ind_other, numbers[ind_other])

            if ind_other != -1:
                break
        
        if ind_other != -1:
            return [ind_p+1, ind_other+1]
        