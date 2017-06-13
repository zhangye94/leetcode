package Easy;

public class P387FirstUniqueCharacterInAString {
	public static int firstUniqChar(String s) {
        int[] store = new int[26];
		for(int i=0;i<s.length();i++){
        	store[s.charAt(i)-'a'] ++;
        }
		for(int i=0;i<s.length();i++){
			if(store[s.charAt(i)-'a'] == 1){
				return i;
			}
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("loveleetcode"));
	}

}
