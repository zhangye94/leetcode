package Easy;

public class P66PlusOne {
	public static int[] plusOne(int[] digits) {
		int l = digits.length-1;
        for(int i=l;i>=0;i--){
        	if(digits[i]<9){
        		digits[i]++;
        		return digits;
        	}
        	digits[i] = 0;
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,9,9,9};
		int[] result = plusOne(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(result[i]);
		}
	}

}
