package Easy;

import java.util.*;

public class P217ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		if(nums.length == 0||nums.length == 1) return false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
        	if(nums[i] == nums[i+1]){
        		return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3};
		System.out.println(containsDuplicate(arr));
	}

}
