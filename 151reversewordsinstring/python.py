class Solution(object):
     def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = [] 
        start = 0
        end = 0
        for i in range(len(s)):
            if s[i] != ' ':
                end += 1
            else:
                if start != end:
                    stack.append(s[start:end])
                end += 1
                start = end
                
        if start != end:
            stack.append(s[start:end])
        
        ans = ""
        length = len(stack)
        for i in range(length):
            ans += stack.pop()
            if i != length -1:
                ans += ' '
                
        return ans

    def reverseWordsUsingBuiltIns(self, s):
        r = enumerate(reversed(s.split()))
        result = ""
        for k,v in r:
            print(k,v)
            result += v+" "
        return result.strip()