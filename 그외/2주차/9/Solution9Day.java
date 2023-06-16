//2 이상의 자연수를 입력받아 2부터 해당 수까지의 소수(prime number)들을 리턴해야 합니다.

/*
입출력 예시
String output = listPrimes(2);
System.out.println(output); // --> '2'

output = listPrimes(6);
System.out.println(output); // --> '2-3-5'

output = listPrimes(18);
System.out.println(output); // --> '2-3-5-7-11-13-17'
 */
public class Solution9Day {

    // 방법 1
    public static boolean checkIsPrimeNumber(int num) {
        if(num < 2) return false;
        for(int i=2 ; i*i<=num; i++) {
            if(num % i == 0) {
                return false; // num이 i의 배수면 소수가 아니므로 false
            }
        }
        return true; // 소수라면 true
    }

    public static String listPrimes(int num) {
        StringBuilder primes = new StringBuilder();
        for(int i=2; i<=num; i++) {
            if(checkIsPrimeNumber(i)) {
                primes.append(i).append("-");
            }
        }
        // 마지막 "-" 제거
        if(primes.length() > 0) {
            primes.setLength(primes.length() - 1);
        }
        return primes.toString();
    }

    public static void main(String[] args) {
        String output = listPrimes(18);
        System.out.println(output); // --> '2'
    }
}