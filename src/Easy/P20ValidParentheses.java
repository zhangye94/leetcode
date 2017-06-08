package Easy;
import java.util.Stack;

public class P20ValidParentheses {
	public static boolean isValid(String s) {
		if(s.length() <= 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i) == '{'||s.charAt(i) == '['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
        	if(s.charAt(i) == ')'){
        		if(stack.isEmpty()){
        			return false;
        		}else if(stack.pop() != '('){
        			return false;
        		}
        	}
        	if(s.charAt(i) == ']'){
        		if(stack.isEmpty()){
        			return false;
        		}else if(stack.pop() != '['){
        			return false;
        		}
        	}
        	if(s.charAt(i) == '}'){
        		if(stack.isEmpty()){
        			return false;
        		}else if(stack.pop() != '{'){
        			return false;
        		}
        	}
        }
        if(stack.isEmpty()){
    		return true;
    	}else{
    		return false;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]{}"));
	}

}
