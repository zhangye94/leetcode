package Easy;

import java.util.ArrayList;
import java.util.List;

public class P448FindAllNumbersDisappearedInAnArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res.add(i+1);
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
