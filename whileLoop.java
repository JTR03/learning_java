// program demonstrating the application of a while loop
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean ans = true;

        while (ans){
            System.out.println("Current song playing");
            System.out.println("Would you like to play the next song");
            String text = input.next();

            if (text.equals("yes")){
                ans = false;
            }
            
        }
        System.out.println("Next song playing");
        
    }
}
