class Solution {
    public String simplifyPath(String input) {
        if(input.charAt(input.length()-1) != '/'){
            input = input + '/';
        }
        List<String> list = new ArrayList();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            String result = "";
            while(input.charAt(i) != '/'){
                result = result + input.charAt(i);
                i++;
            }
            if(result != ""){
                list.add(result);
            }
        }
        String finalResult = "";
        for (String str : list) {
            if(str.contains("..") && str.length() <=2){
                if(finalResult != "")
                    finalResult = finalResult.substring(0, finalResult.lastIndexOf('/'));
            }else{
                if(check(str)){
                    finalResult = finalResult + "/" + str;
                }
            }
        }
        if(finalResult == ""){
            finalResult = "/";
        }
        return finalResult;
    }
    private boolean check(String input){
        if(input.contains("..") && input.length() <= 2){
            return false;
        }
        if(input.contains(".") && input.length() <= 1){
            return false;
        }
        return true;
    }
}