// a foturne telling program using if else statements
import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        System.out.println("PLease type a number between 0 and 10");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num < 5){
            System.out.println("You have something cool coming your way");
        }else{
        System.out.println("You are happy");
        }
    }     
}
