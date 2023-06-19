class Solution {
    public int[] solution(int n, int m) {
        
        // 최대공약수 공식
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        // 최대 공배수 공식
        int[] answer = new int[]{a,(n*m)/a};
        return answer;
    }
}