package leetcode.containsDuplicate;

import java.util.HashSet;

public class ContainsDuplicate {

    /**
     *  如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false
     * */
    public boolean containsDuplicate(int[] nums) {

        if (nums == null || nums.length == 0){
            return false;
        }
        HashSet set = new HashSet();
        for (int i:nums){
            if(set.contains(i)){
                return true;
            }else {
                set.add(i);
            }
        }
        return false;
    }
}
