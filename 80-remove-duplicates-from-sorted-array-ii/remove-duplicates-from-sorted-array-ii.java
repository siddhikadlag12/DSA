class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int unique=1;
        int j=1;

        while(j<nums.length){
            if (i >= 1 && nums[j] == nums[i] && nums[i] == nums[i - 1]) {
                j++;
                continue;
            }
            nums[i+1]=nums[j];
            i++;
            unique++;
            j++;
        }
        return unique;
    }
}