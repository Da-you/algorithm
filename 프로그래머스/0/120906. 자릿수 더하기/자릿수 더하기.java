import java.util.Arrays;

class Solution {
    public int solution(int n) {
        String[] arr = String.valueOf(n).split("");
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
      
    }
}