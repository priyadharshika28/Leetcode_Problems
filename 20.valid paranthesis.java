class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch=='{' || ch=='[' || ch=='(')
            {
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char prev = st.peek();
                if((ch=='}' && prev!='{')||
                   (ch==']' && prev!='[')||
                   (ch==')' && prev!='(')){
                    return false;
                   }
                   st.pop();
            }
        }
        return st.isEmpty();
    }
}
