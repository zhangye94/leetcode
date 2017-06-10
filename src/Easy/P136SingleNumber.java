package Easy;

public class P136SingleNumber {
	public static int singleNumber(int[] nums) {
		if(nums == null || nums.length == 0){
            return -1;
        }
		int res = 0;
        for(int i=0;i<nums.length;i++){
        	res = res ^ nums[i];
        }
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,4,5,2,4,1};
		System.out.println(singleNumber(arr));
	}

}
