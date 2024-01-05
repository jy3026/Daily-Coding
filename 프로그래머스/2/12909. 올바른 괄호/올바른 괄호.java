import java.util.*;

class Solution {
    boolean solution(String s) {
        
        if(s.charAt(0) == ')') return false;
        Stack<Character> stack = new Stack<>();
        
        for(int i =0;i<s.length();i++){    
            if(s.charAt(i) == '('){
                stack.add(s.charAt(i));
            }else if(s.charAt(i) == ')' && !(stack.size()==0)){
                stack.pop();
            }
        }
        
        if(stack.size() == 0) return true; 
               

        return false;
    }
}