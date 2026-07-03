class Solution {
    public int minimumRateToEatBananas(int[] nums, int h) {
        
        int max = 0;
        for(int i =0 ; i <=nums.length -1; i++)
        if(nums[i]>max) max = nums[i];  

        int l = 1;
        int r = max;
       // int ans =0;

       // int ans = 0;
        while (l < r)
        {
            int mid = l + (r-l)/2;

            if(hourcount(nums, mid)<=h)
            {
            //ans = mid;
                r = mid;

            }

            else
            l = mid+1;

                
        }

        return l;
   
    }
     long hourcount(int arr[], int speed){
            long sumt =0;
            for(int k = 0; k < arr.length; k++)
                sumt += (arr[k] + speed-1)/speed;

            return sumt;
        }
}