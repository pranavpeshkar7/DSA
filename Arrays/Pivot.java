public class Pivot{
    public static int pivot(int nums[]){
        int target = 3;
        int index = -1;
        for(int i=0; i<nums.length; i++){
            if(target == nums[i]){
                index = i;
            }
        }
        return index;
    }
    public static void main(String args[]){
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(pivot(nums));
    }
}
