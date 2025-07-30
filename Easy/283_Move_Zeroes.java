// ✅ Problem: Move Zeroes (LeetCode #283)
// 🔗 Link: https://leetcode.com/problems/move-zeroes/
// 📌 Difficulty: Easy
// 📅 Solved On: 25-03-2025
// 🧠 Approach: Two-pointer method. Traverse the array, and when a non-zero element is found, 
//             swap it with the element at the 'left' pointer. This moves all non-zero elements 
//             to the front while pushing zeros to the end.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }
}
