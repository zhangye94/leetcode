package Easy;

public class P371SumOfTwoIntegers {
	public static int getSum(int a, int b) {
        if(b == 0){//没有进为的时候完成运算
           return a;
       }
       int sum,carry;
       sum = a^b;//完成第一步加发的运算
       carry = (a&b)<<1;//完成第二步进位并且左移运算
       return getSum(sum,carry);//
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(2,3));
	}

}
