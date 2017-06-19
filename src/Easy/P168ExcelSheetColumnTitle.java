package Easy;

public class P168ExcelSheetColumnTitle {
	public static String convertToTitle(int n) {
		String res = "";
		char ch;
        while(n>0){
        	ch = (char)((n-1)%26 + 65);
        	res = ch + res;
        	n = (n - 1)/26;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(28));
	}

}
