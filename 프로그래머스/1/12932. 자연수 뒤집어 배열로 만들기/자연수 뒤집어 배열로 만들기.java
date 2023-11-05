import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(long n) {
        String nStr = String.valueOf(n);
        int[] result = new int[nStr.length()];

        for (int i = 0; i < nStr.length(); i++) {
            result[i] = Character.getNumericValue(nStr.charAt(i));
        }

        List<Integer> resultList = Arrays.stream(result)        // int 배열을 스트림으로 변환
                                  .boxed()              // Integer로 박싱
                                  .collect(Collectors.toList());  // 리스트로 변환

        Collections.reverse(resultList);

        // 다시 int 배열로 변환
        result = resultList.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
        return result;
    }
}