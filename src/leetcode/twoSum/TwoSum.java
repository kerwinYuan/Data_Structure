package leetcode.twoSum;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 2){
            return result;
        }
        int indexFrom = 0;
        int indexTo = 1;
        while(nums[indexFrom]+nums[indexTo] != target){
            if (indexTo < nums.length-1){
                indexTo = indexTo+1;
            }else if (indexFrom < nums.length-1){
                indexFrom = indexFrom+1;
                indexTo = indexFrom+1;
            }
        }
        result[0] = indexFrom;
        result[1] = indexTo;
        return result;
    }
    //faster and smaller
    public static int[] twoSumByHash(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if ( map.containsKey(target - nums[i]) ){
                return new int[] {map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] source ={-1,-2,-3,-4,-5};
        int[] result = twoSumByHash(source,-8);
        System.out.println(result[0]+","+result[1]);
    }
}
