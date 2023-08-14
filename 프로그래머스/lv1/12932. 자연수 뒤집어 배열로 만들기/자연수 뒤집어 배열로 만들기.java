class Solution {
    public int[] solution(long n) {
        String[] number = String.valueOf(n).split("");
        int[] answer = new int[number.length];
        int count = number.length-1;
        for(int i=0;i<number.length;i++){
            System.out.println(i);
            answer[count] = Integer.valueOf(number[i]);
            count--;
        }
        
        return answer;
    }
}