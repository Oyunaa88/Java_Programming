package day09_scanner;

import java.util.Scanner;
public class NextLine_vs_Next {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); // Enter key

        System.out.println("Enter your age: ");

        int age = input.nextInt();  //89 + Enter

        input.nextLine(); // take out Enter key

        System.out.println("Enter your full name:");
        String full_name = input.nextLine();

        System.out.println("age = "+ age);
        System.out.println("Full name = "+ full_name);

        input.close();
    }
}
