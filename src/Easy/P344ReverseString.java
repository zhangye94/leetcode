package Easy;

import java.lang.reflect.Array;

public class P344ReverseString {
	public static String reverseString(String s) {
		char[] arr = s.toCharArray();
		char temp;
		int left = 0;
		int right = arr.length - 1;
		while(left<right){
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("hello"));
	}

}
