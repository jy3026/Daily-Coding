//배열을 입력받아 순서가 뒤집힌 배열을 리턴해야 합니다.

import java.util.Arrays;

/*
입출력 예시
int[] output = reverseArr([1, 2, 3]);
System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
 */
public class Solution8Day {

    // 방법 1
    public static int[] reverseArr(int[] arr){
        if(arr.length == 0) return new int[]{};
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));

        int[] dest = new int[head.length + tail.length];
        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);
        return dest;
    }


    public static void main(String[] args) {
        int[] output = reverseArr(new int[]{1,2,3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
}