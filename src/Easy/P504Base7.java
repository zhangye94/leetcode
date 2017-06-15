package Easy;

public class P504Base7 {
	public static String convertToBase7(int num) {
		int temp;
		if (num == 0) return "0";
		String res = "";
		boolean flag = false;
		if(num<0){
			flag = true;
		}
		while(num != 0){
			temp = num % 7;
			num = num / 7;
			res = Math.abs(temp) + res;
		}
		if(flag){
			return '-' + res;
		}else{
			return res;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToBase7(-100));
	}

}
