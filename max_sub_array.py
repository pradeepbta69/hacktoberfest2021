
#53- Maximum Subarray(Leetcode)
class Solution:
    def maxSubArray(self, nums) -> int:
        maxSub = nums[0]
        currentSum = 0
        for i in nums:
            if currentSum<0:
                currentSum = 0
            currentSum+=i
            maxSub = max(maxSub,currentSum)
        return maxSub



s = Solution()
print(s.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))
        