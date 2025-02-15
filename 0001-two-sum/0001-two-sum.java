class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int com = target - nums[i];
            if(hash.containsKey(com)){
                return new int[] {i, hash.get(com)};
            }
            hash.put(nums[i], i);
        }
        return new int[] {};
    }
}