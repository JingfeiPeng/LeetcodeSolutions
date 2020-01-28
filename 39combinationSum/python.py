class Solution(object):
    def combinationSum(self, candidates, target):
        return self.recursion(candidates, target, [], [])

    
    def recursion(self, numbers, target, solutions, current):
        for i in range (len(numbers)):
            current.append(numbers[i])

            if (sum(current) ==  target):
                solutions.append(current[:])
            
            if (sum(current) < target):
                self.recursion(numbers[i:], target, solutions, current)
            
            current.pop()
        
        return solutions