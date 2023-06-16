//문자열 뒤집기
public class Solution12Day2 {
    public static String solution(String my_string, int s, int e) {

        String word1 = my_string.substring(0,s);
        String word2 = my_string.substring(s,e+1);
        String word3 = my_string.substring(e+1);

        StringBuffer sb = new StringBuffer(word2);
        String reverse = sb.reverse().toString();

        return word1+reverse+word3;
    }
}
    public static void main(String[] args) {

        String output = solution("banana",2,3);
        System.out.println(output);
    }
}
