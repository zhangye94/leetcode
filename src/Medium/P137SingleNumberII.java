package Medium;

public class P137SingleNumberII {
	public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0;i<32;i++){
        	int sum = 0;
        	for(int j = 0;j<nums.length;j++){
        		sum = sum + ((nums[j] >> i) & 1);
        	}
        	if(sum%3 !=0){
        		res = res|((sum%3) << i);
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,3,5,5,5,2};
		System.out.println(singleNumber(arr));
	}

}
