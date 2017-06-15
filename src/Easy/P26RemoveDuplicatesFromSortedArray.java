package Easy;

public class P26RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
        int j = 0;
		for(int i=0;i<nums.length;i++){
        	if(nums[i] != nums[j]){
        		nums[++j] = nums[i];
        	}
        }
		return j+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3};
		System.out.println(removeDuplicates(nums));
	}

}
