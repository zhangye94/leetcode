package Easy;

public class P202HappyNumber {
	public static boolean isHappy(int n) {
		if(n == 1|| n == 7){
			return true;
		}
        int sum = n;
        int temp;
        while(sum > 1){
        	temp = sum;
        	sum = 0;
        	while(temp>0){
        		sum = sum + (temp % 10)*(temp % 10);
        		temp = temp/10;
        	}
        	if(sum < 10 & sum!=0){
                if(sum == 1 || sum == 7){ //Base case 
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}

}
