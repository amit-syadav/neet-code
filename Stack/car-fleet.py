class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int: 
        
        time = []
        for i in range(len(position)):
            time.append((target - position[i])/speed[i]) 

        time= [t for p,t in  sorted(zip(position, time),  reverse = False)]  

        for i in range( len(time)-2, -1, -1  ):
            if time[i] < time[i+1]:
                time[i] = time[i+1] 
        
        return len(set(time))


 