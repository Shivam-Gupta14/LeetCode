class Solution {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> s = new Stack<>();
        for(String component : components){
            if(component.equals("") || component.equals(".")){
                continue;
            }
            if(component.equals("..")){
                if(!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(component);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String dir :s){
            sb.append("/").append(dir);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}