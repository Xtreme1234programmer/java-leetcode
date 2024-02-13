class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
      int n=nums.length;
      for(Integer i:nums)
      {
          if(set.contains(i))
          {
              return i;
          }
          else
          {
              set.add(i);
          }
      }
      return -1;
    }
}
