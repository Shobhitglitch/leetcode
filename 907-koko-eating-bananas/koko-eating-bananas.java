class Solution {
    public boolean ispossible(int [] piles,int mid,int h)
    {
        int hour=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]<=mid)
            {
                hour++;
            }
            else if(piles[i]%mid==0)
            {
                hour+=(piles[i]/mid);
            }
            else if(piles[i]%mid != 0)
            {
                hour+=(piles[i]/mid)+1;
            }
            if(hour>h)
            return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1,maxi=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<piles.length;i++)
        {
            maxi=Math.max(maxi,piles[i]);
        }
        while(s<=maxi)
        {
            int mid=(s+maxi)/2;
            if(ispossible(piles,mid,h))
            {
                ans=mid;
                maxi=mid-1;
            }
            else
            s=mid+1;
        }
        return ans;
    }
}