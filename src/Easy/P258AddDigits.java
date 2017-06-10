package Easy;

public class P258AddDigits {
	public static int addDigits(int num) {
        return num<10?num:num%9==0?9:num%9;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(99));
	}

}
