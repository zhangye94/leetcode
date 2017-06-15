package Easy;

public class P507PerfectNumber {
	public static boolean checkPerfectNumber(int num) {
		if (num == 1) return false;
        int sum = 1;
		for(int i=2;i<Math.sqrt(num);i++){
        	if(num % i == 0){
        		sum = sum + i + num/i;
        	}
        }
		if(sum == num){
			return true;
		}else{
			return false;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPerfectNumber(28));
	}

}
