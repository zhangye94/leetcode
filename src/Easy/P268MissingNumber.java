package Easy;

public class P268MissingNumber {
	public static int missingNumber(int[] nums) {
        int temp = 0;
        if(nums.length == 1){
        	if(nums[0] == 0){
        		return 1;
        	}else if(nums[0] == 1){
        		return 0;
        	}
        }
        
		for(int i=1;i<nums.length+1;i++){
        	temp = temp^i;
        }
		for(int i=0;i<nums.length;i++){
			temp = temp^nums[i];
		}
		return temp;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1};
		System.out.println(missingNumber(arr));
	}
}
