// ✅ Problem: Merge Sorted Array (LeetCode #88)
// 🔗 Link: https://leetcode.com/problems/merge-sorted-array/
// 📌 Difficulty: Easy
// 📅 Solved On: 27-03-2025
// 🧠 Approach: Merge two sorted arrays (nums1 and nums2) into a new temporary array (nums3)
//             using two pointers. Finally, copy the sorted elements back into nums1.
//             This solution uses extra space but keeps the logic clean and intuitive.
// ⏱️ Time Complexity: O(m + n)
// 🔁 Space Complexity: O(m + n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                k++;
                i++;
            } else {
                nums3[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }

        for (i = 0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }
    }
}
