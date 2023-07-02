import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i=1;i<words.length;i++){
            char a = words[i].charAt(0);
            char b = words[i - 1].charAt(words[i - 1].length() - 1);

            if (a != b || set.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            set.add(words[i]);
        }

        return answer;
    }
}