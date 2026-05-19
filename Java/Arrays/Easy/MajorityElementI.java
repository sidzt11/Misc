// ________________________________________________________
// Majority Element-I
// ________________________________________________________

class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int ele = 0;

        if (nums.length == 1) return nums[0];

        for(int i = 0; i <= nums.length - 1; i++)
        {
            if(count == 0) {ele = nums[i]; count = 1;}

            else if(nums[i] == ele) count++;
            else count--;
        
        
         }
            return ele;
    }
}

