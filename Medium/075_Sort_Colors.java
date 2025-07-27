// ✅ Problem: Sort Colors (LeetCode #75)
// 🔗 Link: https://leetcode.com/problems/sort-colors/
// 📌 Difficulty: Medium
// 📅 Solved On: 06-03-2025
// 🧠 Approach: Classic Bubble Sort. Repeatedly swap adjacent elements if they are in the wrong order.
//             This sorts the array containing 0s, 1s, and 2s in-place without using extra space.
// ⚠️ Note: Not the most optimal solution; better solutions exist with one-pass and constant space.
// ⏱️ Time Complexity: O(n^2)
// 🔁 Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
