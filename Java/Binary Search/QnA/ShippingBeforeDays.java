public class Solution {
	
	int shipWithinDays(int[] weights, int days)
	{
		int s = weights.length;
        int l =0;
        for(int i = 0; i<s; i++)
            if(weights[i] >= l)l = weights[i];

        int r = 0; 
         for(int i = 0; i<s; i++)
            r+=weights[i];


		int mid;
		// FFTTT
		// r = mid;
		// l = mid +1;
		
		while(l<r)
		{
			mid = l + (r-l)/2 ;
			
			if(shippingDays(weights,mid)<= days)
				r = mid;
			
			else
				l = mid+1;

			
		}
        //no fallback needed like -1 as no case for that
		return l;	
	}
	
	int shippingDays(int[] weights, int mid) {
		//first day is 1
		int day = 1;
		int i = 0;
		int load = 0;
		while(i <= weights.length -1)
		{
		  if(load+weights[i] <= mid)
		  {
			  load+= weights[i];
			  i++;
		  }
		  else
		  {
			load = weights[i];
			day++;
			i++;
		  }
		  		
		}
		
		return day;
		
		
	}
	
	
	
}
