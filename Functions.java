import java.util.Scanner;

public class Functions {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for tea time...");
        System.out.println("Type random word and enter to begin tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("knock off time");

    }
}
