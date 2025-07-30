// ✅ Problem: Remove Element (LeetCode #27)
// 🔗 Link: https://leetcode.com/problems/remove-element/
// 📌 Difficulty: Easy
// 📅 Solved On: 24-03-2025
// 🧠 Approach: Use two pointers (left and right). Traverse the array, and whenever the current element 
//             is not equal to the target value, overwrite the left pointer's position and increment both pointers. 
//             Effectively shifts non-target values to the front.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = 0, count = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
                count++;
            }
            right++;
        }
        return count;
    }
}
