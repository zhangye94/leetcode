package Easy;

public class P260SingleNumberIII {
	public static int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        diff &= -diff;
        int[] rets = {0, 0};
        for (int num : nums)
        {
            if ((num & diff) == 0)
            {
                rets[0] ^= num;
            }
            else
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 1, 3, 2, 5};
		int[] res = singleNumber(arr);
		for(int i=0;i<2;i++){
			System.out.println(res[i]);
		}
	}

}
