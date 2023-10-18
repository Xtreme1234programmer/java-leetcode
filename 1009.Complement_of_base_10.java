class Solution {
    public int bitwiseComplement(int n) {
        int temp=n;
        int rem=0;
        int mul=1;
        int ans=0;
        if(n==0) return 1;
        while(temp>0)
        {
            rem=temp%2;
            rem=rem^1;
            temp/=2;
            ans=ans+rem*mul;
            mul*=2;
        }
        return ans;
    }
}
