class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char aChar : chars){
            if(stack.size() == 0){
                stack.push(aChar);
            }else if(judge(stack.peek(),aChar)){
                stack.pop();
            }else{
                stack.push(aChar);
            }
        }
        return stack.size() == 0;
    }
    boolean judge(char a1,char a2){
         return (a1 == '(' && a2 == ')') || (a1 == '[' && a2 == ']') || (a1 == '{' && a2 == '}');
    } 
}