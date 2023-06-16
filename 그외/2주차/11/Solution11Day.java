import java.util.*;

//배열 만들기 2
public class Solution11Day {
    public static int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=l;i<=r;i++){

            String num = Integer.toString(i);

            boolean check = true;

            for(char c : num.toCharArray()){
                if(c != '0' && c != '5'){
                    check = false;
                    break;
                }
            }

            if(check) list.add(i);

        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        if(answer.length == 0) return new int[]{-1};

        return answer;
    }
    public static void main(String[] args) {

        int[] output = solution(5,555);
        System.out.println(output);
    }
}
