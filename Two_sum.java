import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
class A1
{
    public int[] twoSum(int[] nums,int target) 
    {
        int[] output =new int[2];
       for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                  output[0]=i;
                  output[1]=j;
                  break;

                }
                
            }
        }
        return output;
       
    }
   
    
    public static void main(String[] args) {
       int[] num={1,8,2,3,4};
       Scanner sc =new Scanner(System.in);
        
       System.out.println("enter the target value:");
       int target=sc.nextInt();                               //this is brute force approch --o(n^2)
       A1 a1=new A1();
       int[] x1=a1.twoSum(num, target);
       sc.close();
       for(int i=0;i<2;i++){
       System.out.print(x1[i]+" ");
       }
      
        
    }
    

}
**/
//USING HASHMAP-O(N)
class A1
{
    public int[] twoSum(int[] nums, int target) {

        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
        if(map.containsKey(target-nums[i]))
        {
        result[0]=map.get(target-nums[i]);
        result[1]=i;
        }
        map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num={1,6,3,9,4};
        Scanner sc =new Scanner(System.in);
         
        System.out.println("enter the target value:");
        int target=sc.nextInt();                               
        A1 a1=new A1();
        int[] x1=a1.twoSum(num, target);
        sc.close();
        for(int i=0;i<2;i++){
        System.out.print(x1[i]+" ");
        }

}
}

