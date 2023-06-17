import java.util.*;

public class Main {
    public static double solution() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Double> map = new HashMap<>();
        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);

        String subject = "";
        double grade = 0;
        double gradesum = 0;
        String rating = "";
        double sum = 0;

        for(int i=0;i<20;i++){
            subject = scanner.next();
            grade = scanner.nextDouble();
            rating = scanner.next();

            if(!rating.equals("P")){
                gradesum += grade;
                sum += (grade * map.get(rating));
            }

        }
        return sum/gradesum;

    }
    public static void main(String[] args) {

        double output = solution();
        System.out.println(output);
    }
}