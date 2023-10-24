class Solution {
    public int minAddToMakeValid(String pattern) {
        // Write your code here.
		int open=0;
		int close=0;

		for(int i=0;i<pattern.length();i++)
		{
			char ch=pattern.charAt(i);
			if(ch=='('){open+=1;}
			else{
				if(open==0){close+=1;}
				else{
					open--;

				}
			}

		

		}
			return open+close;

    }
}
