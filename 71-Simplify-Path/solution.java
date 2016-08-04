public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        // int prev = 0;
        String s = path;
        while(s.length() != 0) {
            int curt = getNext(s);
            String tmp = s.substring(0, curt);
            // prev = curt;
            s = s.substring(curt);
            if(tmp.equals("/") || tmp.equals("/.") || (tmp.equals("/..") && stack.empty())) {
                continue;
            } else if(tmp.equals("/..") && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(tmp);
            }
        }
        
        if(!stack.empty()) {
            String res = "";
            while(!stack.empty()) {
                res = stack.pop() + res;
            }
            return res;            
        } else {
            return "/";
        }

    }
    
    private int getNext(String s) {
        if(s.length() == 0) {
            return 0;
        } 
        int i = 1;
        while(i < s.length() && s.charAt(i) != '/') {
            i++;
        }
        return i;
    }
}