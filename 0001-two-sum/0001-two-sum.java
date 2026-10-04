class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int dis=target-nums[i];
            if(map.containsKey(dis)){
                return new int[]{map.get(dis),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}