package Easy;

public class P371SumOfTwoIntegers {
	public static int getSum(int a, int b) {
        if(b == 0){//û�н�Ϊ��ʱ���������
           return a;
       }
       int sum,carry;
       sum = a^b;//��ɵ�һ���ӷ�������
       carry = (a&b)<<1;//��ɵڶ�����λ������������
       return getSum(sum,carry);//
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(2,3));
	}

}
