package Easy;

public class P520DetectCapital {
	public static boolean detectCapitalUse(String word) {
		boolean flag;
		if(word.charAt(0)>='a'&&word.charAt(0)<='z'){
			flag = true;
		}else{
			flag = false;
		}
		if(!flag){
			if(word.toUpperCase() == word){
				return true;
			}else{
				if(word.substring(1).toLowerCase().equals(word.substring(1))){
					return true;
				}else{
					return false;
				}
			}
		}else{
			if(word.toLowerCase() != word){
				return false;
			}else{
				return true;
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(detectCapitalUse("Google"));
	}

}
