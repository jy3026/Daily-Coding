import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();
        for(Long i = 1L; i <= n; i++) {
           list.add(x*i);
        }
        
        long[] arr = list.stream().mapToLong(l -> l).toArray();
        return arr;
    }
}