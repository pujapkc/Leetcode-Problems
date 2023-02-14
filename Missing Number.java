class Solution {
    public int missingNumber(int[] nums) {
      //finding the length of the array
        int n=nums.length;
        int sum=0;
      //find the sum of given array elements
        for(int i=0;i<nums.length;i++){
               sum=sum+nums[i];
        }
      //sum of size of the array
        int expectedsum=(n*(n+1))/2;
          //find the missing number
        int s=expectedsum-sum;
        return s;

    }
}
