// LeetCode 33 - Search in Rotated Sorted Array
// You can test with a main method below.

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {4,5,6,7,0,1,2};
        int target1 = 0;
        System.out.println(sol.search(nums1, target1)); // expected 4

        int[] nums2 = {4,5,6,7,0,1,2};
        int target2 = 3;
        System.out.println(sol.search(nums2, target2)); // expected -1

        int[] nums3 = {1};
        int target3 = 0;
        System.out.println(sol.search(nums3, target3)); // expected -1
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check which side is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}