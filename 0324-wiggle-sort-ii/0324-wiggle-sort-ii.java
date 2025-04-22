class Solution {
    public void wiggleSort(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            // Find the index of the smallest element in the remaining numsay
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        int mid;
        if(n%2==0){
            mid = n/2;

        } else{
            mid = (n+1)/2;
        }
        int[] nums1 = Arrays.copyOfRange(nums,0,mid);
        int[] nums2 = Arrays.copyOfRange(nums,mid,n);
        System.out.println(nums1);
        
        int p1 = nums1.length-1;
        int p2 = nums2.length-1;
        for(int i = 0;i<n;i++){
            if(i%2 ==0){
                nums[i] = nums1[p1];
                p1--;
            } else{
                nums[i] = nums2[p2];
                p2--;
            }
        }
    }
}