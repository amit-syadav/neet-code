class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d_s = {}
        d_t = {}

        for e in s:
            if e in  d_s:
                d_s[e] +=1
            else:
                d_s[e]=1
        
        for e in t:
            if e in  d_t:
                d_t[e] +=1
            else:
                d_t[e]=1
        return d_t== d_s
        
        