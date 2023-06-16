//글자 이어 붙여 문자열 만들기

import java.util.*;
public class Solution11Day7 {
    public static String solution(String my_string, int[] index_list) {
        List<String> list = new ArrayList<>();
        String[] arr = my_string.split("");
        String result = "";

        for(int i=0;i<index_list.length;i++){
            list.add(arr[index_list[i]]);
        }

        for(int i=0;i<list.size();i++){
            result += list.get(i);
        }

        return result;
    }
    public static void main(String[] args) {

        String output = solution("cvsgiorszzzmrpaqpe"	,new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7});
        System.out.println(output);
    }
}
