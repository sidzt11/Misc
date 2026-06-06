class Solution {
    public int[] mergeSort(int[] nums) {

        int n = nums.length;
        int l = 0;
        int r = n-1;
        

        mergeS(nums,l, r);

        return nums;

    }
    
    void mergeS(int[] nums, int l, int r)
    {
        if(l>=r) return;
    
       int mid = l + (r-l)/2;
        mergeS(nums,l,mid );
        mergeS(nums,mid+1, r);
        merge(nums, l,r,mid);

    }

    void merge(int[] nums, int l, int r, int mid)
    {
        int i = l;
        int j = mid+1;;
        int[] temp = new int[r-l+1];
        int p =0;
        
        while(i <= mid && j <= r)
        {
            if(nums[i]<= nums[j])
            temp[p++] = nums[i++];
            else
            temp[p++] = nums[j++];

        }

        while(i<= mid)
            temp[p++] = nums[i++];

        while(j <= r)
            temp[p++] = nums[j++];
    
    
    for(int k = l; k <= r; k++)
        nums[k] = temp[k-l];
    


        return;
    }




}   
