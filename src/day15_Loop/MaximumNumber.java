package day15_Loop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int max = -2147483648;

        for( int i=0; i<5; i++){
            System.out.println("Enter a number:");
            int num=input.nextInt();

            if(num>max){
                max=num;
            }


        }

        System.out.println("max = " + max);
        input.close();
    }

}
/*
Write a program that can ask the user to enter a number for 5 times and returns the maximum number
 */