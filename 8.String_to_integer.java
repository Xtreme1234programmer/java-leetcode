class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }

        int positive=0;
        int negative =0;
        if(i<n&&s.charAt(i)=='-')
        {
            negative++;
            i++;
        }
        if(i<n&&s.charAt(i)=='+')
        {
            positive++;
            i++;
        }
        

        double res=0;
        while(i<n&&s.charAt(i)<='9'&&s.charAt(i)>='0')
        {
            res=res*10+s.charAt(i)-'0';
            i++;
        }

        if(negative>0)
        {
            res=-res;
        }
         // Handling cases where both +ve and -ve signs exist
        if (positive > 0 && negative > 0) {
            return 0;
        }
        if(res>Integer.MAX_VALUE)
        {
            res=Integer.MAX_VALUE;
        }
        if(res<Integer.MIN_VALUE)
        {
            res=Integer.MIN_VALUE;
        }

        return (int)res;
    }
}
