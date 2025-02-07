class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int l2 = nums2.length;
        int[] ans = new int[l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l2; j++) {
                if (nums1[i] == nums2[j]) {
                    int min = Integer.MAX_VALUE;
                    for (int k = j + 1; k < l2; k++) {
                        // int min = -1;
                        if (nums2[k] > nums2[j]) {
                            // min = Math.min(min, nums2[k]);
                            min = nums2[k];
                            ans[i] = min;
                            break;
                        }
                    }
                    if (min == Integer.MAX_VALUE) {
                        ans[i] = -1;
                    }
                }
            }
        }

        return ans;
    }
}