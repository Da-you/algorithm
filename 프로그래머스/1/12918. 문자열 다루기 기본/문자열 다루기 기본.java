class Solution {
    public boolean solution(String s) {
        // 정규식
        // if(s.length() == 4 || s.length() == 6){
        //    return s.matches("(^[0-9]*$)");
        // }
        // return false;
        
        // try - catch
        // if(s.length() == 4 || s.length() == 6){
        //     try{
        //         Integer sToInt = Integer.parseInt(s);
        //         return true;
        //     }catch (Exception e) {
        //         return false;
        //     }
        // }
        // return false;
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) < 48 || s.charAt(i) > 57){
                    return false;
                }
            }
            return true;
        } else{
            return false;
        }
    }
}