import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        printPermutations(0,ans,nums);
        return ans;
    }
    private static void  printPermutations(int index,List<List<Integer>> ans,int[] nums)
    {
        if(index==nums.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                ds.add(nums[i]);
            }
            ans.add(ds);
        return;
        }
    
        


    for(int i=index;i<nums.length;i++)
    {
        swap(index,i,ans,nums);
        printPermutations(index+1,ans,nums);
        swap(index,i,ans,nums);

    }
    }
    private static void swap(int i,int j,List<List<Integer>> ans,int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
}
