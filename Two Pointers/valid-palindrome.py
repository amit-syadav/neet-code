class Solution:
    def isPalindrome(self, s: str) -> bool:
        s_l = s.lower()

        # s_l = s_l.split() #list
        s_string = []

        for char in list(s_l) :  
            if char.isnumeric() or char.isalpha():
                s_string.append(char)
        # print(s_string, s_string[::-1])

        n = len(s_string)
        # print(s_string[:n//2:1] , s_string[:(n-1)//2:-1])


        return s_string[:n//2:1] == s_string[:(n-1)//2:-1] #CRUX of the question


