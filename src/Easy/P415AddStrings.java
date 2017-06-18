package Easy;

public class P415AddStrings {
	public static String addStrings(String num1, String num2) {
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int sum = 0;
        String res = "";
        while(len1>=0||len2>=0){
        	if(len1>=0){
        		sum = sum + num1.charAt(len1) - '0';
        	}
        	if(len2>=0){
        		sum = sum + num2.charAt(len2) - '0';
        	}
        	if(sum >= 10){
        		if(Math.max(len1, len2) == 0){
        			res = sum + res;
        		}else{
        			res = sum%10 + res;
        		}
        		sum = 1;
        	}else{
        		res = sum + res;
        		sum = 0;
        	}
        	len1--;
        	len2--;
        }
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addStrings("99","9"));
	}

}
