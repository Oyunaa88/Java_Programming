package day04_concatenation;

public class ConcatenationIntro {

    public static void main(String[] args) {

        String name = "Alexander";

        int age = 35;

        int salary = 85_000;// _ makes it more readable

        System.out.println("Hello "+ name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your salary is " + salary + " USD");
    }
}
