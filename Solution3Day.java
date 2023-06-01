import java.util.*;


//arr[i]의 첫 번째 요소를 키, 두 번째 요소를 값으로 하는 HashMap<String, String>을 리턴해야 합니다.

/*
입출력 예시
String[][] arr = new String[]{
  {'make', 'Ford'},
  {'model', 'Mustang'},
  {'year', '1964'},
  {'make', 'Bill'},
};

HashMap<String, String> output = convertListToObject(arr);

System.out.println(output) // -->
{
  "make" = "Ford"
  "model" = "Mustang",
  "year" = "1964"
}
 */
public class Solution3Day {

    // 방법 1
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        HashMap<String, String> output = new HashMap<>();
        if(arr.length == 0) return output;

        for(int i =0;i<arr.length;i++){
            if(arr[i].length != 0) {
                if(!output.containsKey(arr[i][0])){
                    output.put(arr[i][0],arr[i][1]);
                }
            }
        }

        return output;
    }

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = convertListToHashMap(arr);

        System.out.println(output);
    }
}