public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] list = mergeList(nums1, nums2);
        return median(list);
    }
    
    private double median(int[] nums) {
        int len = nums.length;
        if (len % 2 == 1) {
            return nums[len / 2] * 1.0;
        } else {
            return (nums[len / 2 - 1] + nums[len / 2]) / 2.0;
        }
    } 

    private int[] mergeList(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) {
            return nums2;
        }
        if (nums2 == null || nums2.length == 0) {
            return nums1;
        }        
        int len = nums1.length + nums2.length;
        int[] list = new int[len];
        int count = 0, p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                list[count++] = nums1[p1++];
            } else {
                list[count++] = nums2[p2++];
            }
        }
        if (p1 == nums1.length) {
            while (p2 < nums2.length) {
                list[count++] = nums2[p2++];
            }
        } else {
            while (p1 < nums1.length) {
                list[count++] = nums1[p1++];
            }            
        }
        return list;
    }
}