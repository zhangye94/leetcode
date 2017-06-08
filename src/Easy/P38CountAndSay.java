package Easy;

public class P38CountAndSay {
	public static String countAndSay(int n) {
        String s = "11";
        int count;
        String temp;
        if(n == 1){
        	return "1";
        }
        for(int i=0;i<n-2;i++){
        	count = 1;
        	temp = "";
        	for(int j=0;j<s.length();j++){
        		if(j == s.length()-1){
        			temp = temp + count + s.charAt(j);
        			count = 1;
        		}else{
        			if(s.charAt(j)==s.charAt(j+1)){
	        			count ++;
	        		}else{
	        			temp = temp + count + s.charAt(j);
	        			count = 1;
	        		}
        		}
        	}
        	s = temp;
        }
        return s;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(5));
	}

}
