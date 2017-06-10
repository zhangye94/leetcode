package Easy;

public class P167TwoSumII {
	public static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;
		int[] res = new int[2];
        while(left < right){
        	if(numbers[left] + numbers[right] == target){
        		res[0] = left + 1;
        		res[1] = right + 1;
        		return res;
        	}else if(numbers[left] + numbers[right] > target){
        		right --;
        	}else{
        		left ++;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 7, 11, 15};
		System.out.println(twoSum(arr,9)[0]);
		System.out.println(twoSum(arr,9)[1]);
	}

}
