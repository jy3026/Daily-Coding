//문자열 여러 번 뒤집기

public class Solution11Day9 {
    public static String solution(String my_string, int[][] queries) {
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];

            String cut1 = my_string.substring(0,start);
            String cut2 = my_string.substring(start,end+1);
            String cut3 = my_string.substring(end+1);

            StringBuffer sb = new StringBuffer(cut2);
            String reverse = sb.reverse().toString();


            my_string = cut1+reverse+cut3;
        }

        return my_string;
    }
    public static void main(String[] args) {

        String output = solution("rermgorpsam",new int[][]{{2,3},{0,2},{1,4},{6,10}});
        System.out.println(output);
    }
}
