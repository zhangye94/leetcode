package Easy;

import java.util.ArrayList;
import java.util.List;

public class P500KeyboardRow {
	public static String[] findWords(String[] words) {
		String[] arr = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		int flag = 0;
		List<String> res = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
        	flag = 0;
        	for(int j=0;j<words[i].length();j++){
        		if(arr[0].indexOf(words[i].toLowerCase().charAt(j)) != -1&&(flag == 0||flag == 1)){
        			flag = 1;
        		}else if(arr[1].indexOf(words[i].toLowerCase().charAt(j)) != -1&&(flag == 0||flag == 2)){
        			flag = 2;
        		}else if(arr[2].indexOf(words[i].toLowerCase().charAt(j)) != -1&&(flag == 0||flag == 3)){
        			flag = 3;
        		}else {
        			flag = 0;
        			break;
        		}
        		if(j == words[i].length()-1&&flag!=0){
        			res.add(words[i]);
        		}
        	}
        }
		return res.toArray(new String[0]);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"a", "b"};
		for(int i=0;i<findWords(arr).length;i++){
			System.out.println(findWords(arr)[i]);
		}
	}

}
