package Easy;

public class P485MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
		for(int i=0;i<nums.length;i++){
        	if(nums[i] == 1){
        		count ++;
        		if(count > max) max= count;
        	}else{
        		count = 0;
        	}
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}

}
