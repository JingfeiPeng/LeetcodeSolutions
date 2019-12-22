class Solution {
    public boolean popOrNot(Stack<Character> brackets, char c){
        if (!brackets.isEmpty()){
            if (brackets.peek() == c){
                brackets.pop();
                return true;
            }else {
                return false;
            }
        } 
        return false;

    }

    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '(':
                case '{':
                case '[':
                    brackets.push(c);
                    break;
                case ')':
                    if (!this.popOrNot(brackets, '(')){
                        return false;
                    }
                    break;
                case '}':
                    if (!this.popOrNot(brackets, '{')){
                        return false;
                    }
                    break;
                case ']':
                    if (!this.popOrNot(brackets, '[')){
                        return false;
                    }
                    break;
            }
        }
        return brackets.isEmpty();
    }

}
