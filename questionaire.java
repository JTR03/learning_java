import java.util.Scanner;

public class questionaire {
    public static void main(String[] args) {
        String q = "what is 5 + 3 - 2 * 10, type 1 answer:";
        String o1 = "26";
        String o2 = "60";
        String o3 = "28";

        System.out.println(q);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Scanner input = new Scanner(System.in);
        String ans = input.next();

        if(ans.equals(o2)){
            System.out.println("Congratulation that's the answer is correct");
        }else {
            System.out.println("Sorry that's wrong, correct answer is 60");
        }
        
    }
}
