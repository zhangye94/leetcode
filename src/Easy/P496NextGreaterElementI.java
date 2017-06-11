package Easy;

public class P496NextGreaterElementI {
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] res = new int[findNums.length];
        for(int i=0;i<findNums.length;i++){
        	for(int j=0;j<nums.length;j++){
        		if(findNums[i] == nums[j]){
        			
        		}
        	}
        }
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4,1,2};
		int[] arr2 = {1,3,4,2};
		System.out.println(nextGreaterElement(arr1,arr2));
		
	}

}
