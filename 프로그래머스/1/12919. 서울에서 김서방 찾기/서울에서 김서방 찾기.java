import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        // String answer = "";
        // int x = 0;
        // for(int i = 0; i < seoul.length; i++){
        //     if (seoul[i].equals("Kim")){
        //         x = i;
        //     }
        // }
        // answer = "김서방은 " + x + "에 있다";
        // return answer;
        int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
    }
}