class Solution {
public void swap(int[] nums,int start,int end){
    
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
}

    public void sortColors(int[] nums) {
      int index = 0; 
      for(int i=0;i<2;i++){
          int ele = i;
          for(int j=0;j<nums.length;j++){
              if(nums[j]==ele){
                  swap(nums,index,j);
                  index++;
              }
          }
      } 
    }

}