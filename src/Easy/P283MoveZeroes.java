package Easy;

public class P283MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int count = 0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0){
        		nums[count] = nums[i];
        		count ++;
        	}
        }
        for(int i=count;i<nums.length;i++){
        	nums[i] = 0;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 0, 3, 12};
		moveZeroes(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);	
		}
	}

}
