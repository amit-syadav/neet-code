class Solution:

    def encode(self, strs: List[str]) -> str:
        res = str()
        for i in range( len(strs)):
            res = res + strs[i] + "<?:>"
        return res

    def decode(self, s: str) -> List[str]:
        if len(s) !=0:
            return s[:-4].strip().split("<?:>")
        else:
            return []
