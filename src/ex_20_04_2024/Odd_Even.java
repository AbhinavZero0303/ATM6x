package ex_20_04_2024;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Number is even "+ num);
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
