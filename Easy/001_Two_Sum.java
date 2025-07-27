// ✅ Problem: Two Sum (LeetCode #1)
// 🔗 Link: https://leetcode.com/problems/two-sum/
// 📌 Difficulty: Easy
// 📅 Solved On: 06-03-2025
// 🧠 Approach: Brute-force nested loop. Check all possible pairs (i, j) to find the two numbers 
//             that add up to the target. Stores the indices of the correct pair in the result array.
// ⚠️ Note: Not optimal. A better solution exists using a HashMap in O(n) time.
// ⏱️ Time Complexity: O(n^2)
// 🔁 Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
