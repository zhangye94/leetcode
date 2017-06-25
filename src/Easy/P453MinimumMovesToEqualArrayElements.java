package Easy;

public class P453MinimumMovesToEqualArrayElements {
	public static int minMoves(int[] nums) {
        int min = nums[0];
        int res = 0;
		for(int i=0;i<nums.length;i++){
        	min = Math.min(min, nums[i]);
        }
		for(int i=0;i<nums.length;i++){
			res = res + nums[i] - min;
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		System.out.println(minMoves(arr));
	}

}
