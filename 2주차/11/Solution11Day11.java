//부분 문자열 이어 붙여 문자열 만들기

public class Solution11Day11 {
    public static String solution(String[] my_strings, int[][] parts) {
        String answer = "";

        for(int i =0;i<parts.length;i++){
            int start = parts[i][0];
            int end = parts[i][1];

            String subSt = my_strings[i].substring(start,end+1);

            answer += subSt;
        }
        return answer;
    }
    public static void main(String[] args) {

        String output = solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"},new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}});
        System.out.println(output);
    }
}
