class Solution {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum = 0;
        int n = nums.length;
        int count = 0;

        for(int i = 0;i<n;i++){
            prefixSum = prefixSum + nums[i];
            if(map.containsKey(prefixSum-k)){
                count = count + map.get(prefixSum-k);
            }
            if(map.containsKey(prefixSum)){
                map.put(prefixSum,map.get(prefixSum)+1);
            }else{
                map.put(prefixSum,1);
            }
        }
        return count;
    }
}