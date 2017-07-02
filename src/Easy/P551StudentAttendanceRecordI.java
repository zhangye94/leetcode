package Easy;

public class P551StudentAttendanceRecordI {
	public static boolean checkRecord(String s) {
		int countA = 0;
		int countL = 0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i) == 'A'){
        		countA ++;
        		countL = 0;
        		if(countA>1){
        			return false;
        		}
        	}else if(s.charAt(i) == 'L'){
        		countL ++;
        		if(countL>2){
        			return false;
        		}
        	}else{
        		countL = 0;
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkRecord("LALL"));
	}

}
