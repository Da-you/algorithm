class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = money/ 5500;
        int change = money - (5500 * coffee);
        answer[0] = coffee;
        answer[1] = change;
        return answer;
    }
}