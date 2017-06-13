package Easy;

public class P326PowerOfThree {

	public static boolean isPowerOfThree(int n) {
        return n>0&&(Math.pow(3, 19)%n==0);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(4));
	}

}
