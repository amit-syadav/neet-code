from collections import defaultdict


class Solution:
    def maxArea(self, height: List[int]) -> int:
        def mark_it_visited( ele, visited, ind):
             
            # while visited[ ind[ele][i] ] == 1 and i < len(ind[ele]):
            #     i+=1
            return ind[ele].pop()
 
            

        ind = defaultdict(list)

        for i in range(len(height)-1,-1,-1):
            ind[height[i]].append(i)
        height.sort()

        visited = [0 for i in range(len(height))]

        #print(ind)

        left = 0
        right = len(height)-1
        res = 0

        #print(visited)
        #print(height)
        for  i in range(len(height)-1) :
            ele = height[i]
            actual_i = mark_it_visited( ele, visited, ind)

            visited[actual_i] = 1

            #print(visited)
 
            while left< len(visited)-1 and right> 0 and (visited[left]  == 1 or  visited[right]==1 ):
                if visited[left]  == 1:
                    left+=1
                if visited[right]==1:
                    right -=1
            
                
            iter_res= max(actual_i- left  , right-actual_i) 



            #print('find farthest', left, right)
            #print(res, ele,iter_res , actual_i)
            res = max(res, iter_res *ele)
 

       # print(visited)

        return res


        