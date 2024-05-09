class Solution {
    public int solution(int num1, int num2) {
        float temp = (float) num1 / num2 * 1000;
        int answer = (int) temp;
        return answer;
    }
}