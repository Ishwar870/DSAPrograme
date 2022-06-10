package Math;

public class SumofAllSubsetXORTotals {
    public static int subsetXORSum(int[] nums) {
        return rec(nums,0,0);
    }
    public static int rec(int[] nums, int i, int xor){
        if (i == nums.length)
            return xor;
        return rec(nums,i+1,xor) + rec(nums,i+1,xor^nums[i]);
    }
    public static void main(String[] args) {
        int arr[] = {1,3};
        subsetXORSum(arr);
        System.out.println(subsetXORSum(arr));
    }
}
