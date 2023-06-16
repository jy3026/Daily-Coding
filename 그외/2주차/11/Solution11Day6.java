//주사위 게임 3
public class Solution11Day6 {
    public static int solution(int a, int b, int c, int d) {
        int[] counts = new int[7]; // 0은 안씀

        counts[a]++;
        counts[b]++;
        counts[c]++;
        counts[d]++;

        int score = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 4) {
                score = 1111 * i;
                return score;
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (counts[j] == 1) {
                        score = (10 * i + j) * (10 * i + j);
                        return score;
                    }
                }
            }
        }

        int twoCount = 0, oneCount = 0;
        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) twoCount++;
            if (counts[i] == 1) oneCount++;
        }

        if (twoCount == 2) {
            int p = 0, q = 0;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    if (p == 0) {
                        p = i;
                    } else {
                        q = i;
                    }
                }
            }
            score = (p + q) * Math.abs(p - q);
            return score;
        }

        if (twoCount == 1 && oneCount == 2) {
            int p = 0, q = 0, r = 0;
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 2) {
                    p = i;
                } else if (counts[i] == 1) {
                    if (q == 0) {
                        q = i;
                    } else {
                        r = i;
                    }
                }
            }
            score = q * r;
            return score;
        }

        if (oneCount == 4) {
            score = Math.min(Math.min(a, b), Math.min(c, d));
            return score;
        }

        return score;
    }
    public static void main(String[] args) {

        int output = solution(2,3,4,5);
        System.out.println(output);
    }
}
