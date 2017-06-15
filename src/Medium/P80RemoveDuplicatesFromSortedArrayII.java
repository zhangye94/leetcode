package Medium;

public class P80RemoveDuplicatesFromSortedArrayII {
	public static int removeDuplicates(int[] nums) {
		if(nums==null || nums.length==0)  return 0;  
		int count = 0;
		int j = 0;
		for(int i=0;i<nums.length;i++){
			if (j < 2 || nums[i] != nums[j-2])
	            nums[j++] = nums[i];
		}
		return j;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,2,2,2,3,3};
		System.out.println(removeDuplicates(arr));
	}

}
