// ✅ Problem: Remove Duplicates from Sorted Array (LeetCode #26)
// 🔗 Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// 📌 Difficulty: Easy
// 📅 Solved On: 24-03-2025
// 🧠 Approach: Two-pointer approach. Start from index 1 and compare each element with the previous one.
//             If it's different, move it to the position at index `k`. This removes duplicates in-place.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { 
                nums[k] = nums[i]; 
                k++;
            }
        }

        return k;
    }
}

// Or you can use the below provided approach which takes the 1ms 

// 📅 Solved On: 2025-07-27
// 🧠 Approach: Two-pointer approach using `left` and `right`. 
//             Traverse the array with `right`, and whenever a new unique value is found,
//             move `left` forward and overwrite it with the current `right` value.
//             The `count` variable tracks the number of unique elements.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0, count = 1;

        while (right < nums.length) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
                right++;
                count++;
            } else {
                right++;
            }
        }

        return count;
    }
}

