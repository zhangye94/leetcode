package Medium;

public class P3LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		int res=0, left=0;  
        int prev[]=new int[300];  
        for (int i=0;i<300;i++){
        	prev[i]=-1;  
        }
        for(int i=0;i<s.length();i++){
        	if(prev[s.charAt(i)]>=left){
        		left = prev[s.charAt(i)]+1;
        	}
        	prev[s.charAt(i)] = i;
        	if(res<i-left+1){
        		res = i-left+1;
        	}	
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("pwwkew"));
            
	}

}
