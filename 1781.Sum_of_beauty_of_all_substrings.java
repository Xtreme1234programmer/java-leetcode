class Solution {
    public int beautySum(String s) {
    int ans=0;
      
        for(int i=0;i<s.length();i++)
        {
              int[] count=new int[26];
            for(int j=i;j<s.length();j++)
            {
                count[s.charAt(j)-'a']++;
                ans+=beauty(count);
            }
        }
        return ans;
    }

    public static int beauty(int[] count)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int fre:count)
        {
            if(fre==0) continue;
            max=Math.max(max, fre);
            min=Math.min(min, fre);

        }
        return max-min;
    }
}
