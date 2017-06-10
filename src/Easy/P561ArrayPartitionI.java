package Easy;
import java.util.Arrays;

public class P561ArrayPartitionI {
	public static int arrayPairSum(int[] nums) {
        int n = nums.length/2;
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<n;i++){
        	sum = sum + nums[2*i];
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,3,2};
		System.out.println(arrayPairSum(arr));
	}

}
