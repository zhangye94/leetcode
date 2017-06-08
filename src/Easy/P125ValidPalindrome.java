package Easy;

public class P125ValidPalindrome {
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase();
	    if(s.length()<=1){
	        return true;
	    }
	    int length = s.length();
        int start = 0;
        int end = length-1;
        while(start<end){
        	while(start<end&&!((s.charAt(start)>='a'&&s.charAt(start)<'z')||(s.charAt(start)>='0'&&s.charAt(start)<='9'))){
        		start ++;
        	}
        	while(start<end&&!((s.charAt(end)>='a'&&s.charAt(end)<'z')||(s.charAt(end)>='0'&&s.charAt(end)<='9'))){
        		end --;
        	}
        	if(s.charAt(start)!=s.charAt(end)){
        		return false;
        	}
        	start ++;
        	end --;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("ab"));
	}

}
