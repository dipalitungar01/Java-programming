package ch5_loopControlInstruction;

import java.util.Scanner;

public class ch5Tackinginput {
    public static void main(String[] args){
        System.out.println("taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("enter number 2");
        //int b = sc.nextInt();
        float b = sc.nextFloat();
        //int sum = a + b;
        float sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}

