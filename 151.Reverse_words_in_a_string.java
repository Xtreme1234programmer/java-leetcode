class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1;i>0;i--)
        {
            if(str[i]=="") 
            {
                continue;
            }
            sb.append(str[i]+" ");
        }
       
        sb.append(str[0]);
        return sb.toString();
    }
  
}
