package Easy;

public class P169MajorityElement {
	public static int majorityElement(int[] nums) {
        int count=0;
        int res=nums[0];
		for(int i=0;i<nums.length;i++){
			if(count == 0){
				count ++;
				res=nums[i];
			}else if(res==nums[i]){
        		count ++;
        	}else{
        		count --;
        	}
        }
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={3,2,3};
		System.out.println(majorityElement(arr));
	}

}
