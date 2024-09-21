class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        res_li = []

        def apply(ele, res_li):
            op2 = int(res_li.pop())
            op1 = int(res_li.pop())

            # print('in apply:',op1, op2)

            if ele == "+":
                res_li.append(op1+ op2)
            elif ele == "-":
                res_li.append(op1-op2)
            elif ele == "*":
                res_li.append(op1*op2)
            else:
                res_li.append(int(op1/op2))
            # print(res_li)

        def add_ele(ele, res_li):
            res_li.append(ele)
            # print(res_li)

        # reverse the tokens 

        for ele in tokens:
            # print(' for ele:', ele)
            if ele in ("+", "-", "*",  "/"):
                apply(ele, res_li)
            else:
                add_ele(ele, res_li)
        
        # print(res_li)
        return int(res_li.pop())