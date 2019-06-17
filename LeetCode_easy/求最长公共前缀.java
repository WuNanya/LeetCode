class Solution {
    String[] stred;
    public String longestCommonPrefix(String[] strs) {
        
        int min = 1000;
        int flag = 0;
        if(strs.length == 0){
            return "";
        }
        for(int i = 0;i<strs.length;i++){
            if(strs[i].length()<min){
                flag = i;
                min = strs[i].length();
            }
        }
        stred = strs;
        for(int i = strs[flag].length();i>=0;i--){
            String temp = strs[flag].substring(0,i);
            if(pan(temp)){
                return temp;
            }
        }
        return "";
        
    }
    public boolean pan(String temp){
        for(int i = 0;i<stred.length;i++){
            if(!stred[i].startsWith(temp)){
                return false;
            }
        }
        return true;
    }
}