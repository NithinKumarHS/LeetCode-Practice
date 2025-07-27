// ✅ Problem: Missing Number (LeetCode #268)
// 🔗 Link: https://leetcode.com/problems/missing-number/
// 📌 Difficulty: Easy
// 📅 Solved On: 06-03-25
// 🧠 Approach: Use the formula for the sum of first n natural numbers: n(n+1)/2,
//             then subtract the sum of array elements from it to find the missing number.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int current_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            current_sum += nums[i];
        }
        return (sum - current_sum);
    }
}
