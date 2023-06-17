import java.util.*;

public class Main {
    public static int solution() {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();

        List<String> list = new ArrayList<>(Arrays.asList("c=","c-","dz=","d-","lj","nj","s=","z="));

        for(int i=0;i < list.size();i++){

            if(word.contains(list.get(i))){
                word = word.replace(list.get(i),"?");
            }

        }
        return word.length();
    }
    public static void main(String[] args) {

        int output = solution();
        System.out.println(output);
    }
}