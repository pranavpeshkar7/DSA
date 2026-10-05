public class Demo{
    public static void removeDuplicates(int[] nums) {
        int expectedNums[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){   
            int j = 0;     
            while(nums[i] == nums[j]){
                expectedNums[nums[i]]++;
                j++;
            }
            j++;
        }
        
        // int k = 0;
        for(int i=0; i<expectedNums.length; i++){
            System.out.print(expectedNums[i]+" ");
        }
        // return k;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}