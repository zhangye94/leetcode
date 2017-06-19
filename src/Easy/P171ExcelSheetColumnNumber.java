package Easy;

public class P171ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
		int res = 0;
		int temp = 0;
        for(int i=0;i<s.length();i++){
        	temp = s.charAt(i) - 'A' + 1;
        	res = res*26 + temp;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AB"));
	}

}
