package Easy;

public class P231PowerOfTwo {
	public static boolean isPowerOfTwo(int n) {
        return n>0&&(Math.pow(2, 32)%n==0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfTwo(4));
	}

}
