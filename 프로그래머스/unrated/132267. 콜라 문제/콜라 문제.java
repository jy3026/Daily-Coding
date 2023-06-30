class Solution {
    public int solution(int a, int b, int n) {
    int answer = 0;
    int emptyBottles = n;

    while (emptyBottles >= a) {
        // 새로 받은 콜라 병 수를 구하고 누적
        int newBottles = emptyBottles / a * b;
        answer += newBottles;
        
        // 남은 빈 병 개수 계산
        emptyBottles = emptyBottles % a + newBottles;
    }

    return answer;
    }
}