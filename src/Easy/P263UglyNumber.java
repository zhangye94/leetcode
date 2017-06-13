package Easy;

public class P263UglyNumber {
	public static boolean isUgly(int num) {
		if(num == 1||num == 2||num == 3||num == 5) return true;
        if(num<=0) return false;
        while(num%2 == 0){
        	num = num/2;
        }
        while(num%3 == 0){
        	num = num/3;
        }
        while(num%5 == 0){
        	num = num/5;
        }
        if(num == 1){
        	return true;
        }else{
        	return false;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(8));
	}

}
