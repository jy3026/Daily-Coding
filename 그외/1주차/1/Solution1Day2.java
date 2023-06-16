//연이율을 입력받아 원금이 2배 이상이 될 때까지 걸리는 시간(년)을 리턴해야 합니다.

/*
입출력 예시
int output = computeWhenDouble(7);
System.out.println(output); // --> 11

output = computeWhenDouble(10);
System.out.println(output); // --> 8
 */

public class Solution1Day2 {
    public static int computeWhenDouble(double interestRate) {
        double i = 1;
        int count = 0;
        interestRate = interestRate / 100 ;

        while(i < 2) {
            i = i + (i * (interestRate));
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int output = computeWhenDouble(7);

        System.out.println(output);
    }
}
