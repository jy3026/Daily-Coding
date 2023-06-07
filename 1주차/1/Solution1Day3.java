//수를 입력받아 2의 거듭제곱인지 여부를 리턴해야 합니다.

/*
입출력 예시
boolean output1 = powerOfTwo(16);
System.out.println(output1); // true
boolean output2 = powerOfTwo(22);
System.out.println(output2); // false
 */

public class Solution1Day3 {
    public static boolean powerOfTwo(long num) {
        while(num >= 2){
            if(num%2 != 0) return false;

            num = num/2;
        }

        return true;
    }

    public static void main(String[] args) {

        boolean output = powerOfTwo(16);
        System.out.println(output);
    }
}