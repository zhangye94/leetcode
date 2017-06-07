package Easy;
import java.util.Arrays;

public class P1TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		if(nums == null||nums.length<=0){
            return res;
		}
		int length = nums.length;
		int[] originArr  = new int[length];
		for(int i=0;i<nums.length;i++){
			originArr[i] = nums[i];
		}
        Arrays.sort(nums);
        int start = 0;
        int end = length - 1;
        int flag1 = 0;
        int flag2 = 0;
        while(start < end){
        	if(nums[start]+nums[end] == target){
        		for(int i=0;i<originArr.length;i++){
        			if((originArr[i] == nums[start])&&(flag1 == 0)){
        				res[0] = i;
        				flag1 = 1;
        			}
        			if((originArr[originArr.length-i-1] == nums[end])&&(flag2 == 0)){
        				res[1] = originArr.length-i-1;
        				flag2 = 1;
        			}
        		}
        		return res;
        	}
        	if(nums[start]+nums[end] < target){
        		start ++;
        	}
        	if(nums[start]+nums[end] > target){
        		end --;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,3};
		int[] b = twoSum(a,6);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
	}

}
