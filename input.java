// string concatination and getting user input

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String name = "Jonathan";
        String surname = "Tshikala";
        String aka = "JTR";

        System.out.println(name + " " + surname + " he is also known as " + aka);
        System.out.println("What new aka do you have for Him?");

        Scanner input = new Scanner(System.in);
        aka = input.nextLine();

        System.out.println(name + " " + surname + " has a new aka and it's " + aka);


    }
}
