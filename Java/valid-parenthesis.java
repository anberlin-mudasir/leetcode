/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

*/


class Solution {
    public boolean isValid(String s) {
     
        
        Stack <Character> stack =new Stack<Character>();
        
        for (char c : s.toCharArray()){
            
            if ( c=='(' || c=='[' || c=='{' )
                stack.push(c);
            
            if( c==')' || c==']' || c=='}' ){
                
                if (stack.isEmpty())
                    return false;
                else if(!isMatching(stack.pop(), c))
                        return false;
            }
                
            }
            
            if(stack.isEmpty())
                return true;
            else 
                return false;
            
        }
        
        public boolean isMatching(char c1, char c2){
            if(c1=='(' && c2==')')
                return true;
            else if (c1=='{' && c2=='}')
                return true;
            else if (c1=='[' && c2==']')
                return true;
            else 
                return false;
            
        
        
    }
    

}
