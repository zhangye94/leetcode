package Easy;

public class P557ReverseWordsInAStringIII {
	public static String reverseWords(String s) {
		char[] arr = (s+" ").toCharArray();
		int left = 0;
		int right;
		char temp;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==' '){
				right = i-1;
				while(left<right){
					temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left ++;right --;
				}
				left = i+1;
			}
		}
		String res = new String(arr);
		return res.substring(0, res.length()-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
