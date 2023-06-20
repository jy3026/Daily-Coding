import java.util.*;

class Solution {
    private int count = 0;

    public int solution(int[] number) {
        backtrack(number, new ArrayList<>(), 0, 0);
        return count;
    }

    private void backtrack(int[] number, List<Integer> selected, int start, int sum) {
        if (selected.size() == 3) {
            if (sum == 0) {
                count++;
            }
            return;
        }

        for (int i = start; i < number.length; i++) {
            selected.add(number[i]);
            backtrack(number, selected, i + 1, sum + number[i]);
            selected.remove(selected.size() - 1);
        }
    }
}