// ✅ Problem: Plus One (LeetCode #66)
// 🔗 Link: https://leetcode.com/problems/plus-one/
// 📌 Difficulty: Easy
// 📅 Solved On: 26-03-2025
// 🧠 Approach: Start from the last digit and simulate adding 1.
//             If a digit becomes less than 9, increment and return.
//             If a digit is 9, set it to 0 and continue.
//             If all digits are 9 (like 999), create a new array with leading 1.
// ⏱️ Time Complexity: O(n)
// 🔁 Space Complexity: O(n) — in worst case where new digit is added

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newdigit = new int[n + 1];
        newdigit[0] = 1;
        return newdigit;
    }
}
