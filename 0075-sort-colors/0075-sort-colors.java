class Solution {
    public void sortColors(int[] nums) {
        int l = nums.length;
        int a =  0;
        int b = 0;
        int c = 0;
        for (int i=0; i<l; i++){
            if (nums[i] == 0){
                a++;
            };
            if (nums[i] == 1){
                b++;
            };
            if (nums[i] == 2){
                c++;
            };

        }

        int counter =0;
        for (int i = 0; i<a;i++){
            nums[counter] = 0;
            counter++;
        }
        for (int i = 0; i<b;i++){
            nums[counter] = 1;
            counter++;
        }

        for (int i = 0; i<c;i++){
            nums[counter] = 2;
            counter++;
        }
    }
}