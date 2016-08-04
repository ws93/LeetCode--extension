public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() == 0 || arr[i].equals(".") || (arr[i].equals("..") && stack.empty())) {
                continue;
            } else if(arr[i].equals("..") && !stack.empty()) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        if(!stack.empty()) {
            String res = "";
            while(!stack.empty()) {
                res = "/" + stack.pop() + res;
            }
            return res;            
        } else {
            return "/";
        }

    }
}