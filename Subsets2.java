class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
 Arrays.sort(nums);
		List<List<Integer>> ans=new ArrayList<>();
		findSubsets(0,nums,ans,new ArrayList<>());
		return ans;



	}
	private static void findSubsets(int ind,int[] input,List<List<Integer>> ans,List<Integer> ds)
	{
	
			ans.add(new ArrayList<>(ds));//empty set
		

		for(int i=ind;i<input.length;i++)
		{
			if(i>ind&&input[i-1]==input[i]) continue;
			ds.add(input[i]);
			findSubsets(i+1,input,ans,ds);
			ds.remove(ds.size()-1);
		}
	}
}
