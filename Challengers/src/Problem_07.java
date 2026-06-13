//create a program to swap two numbers

import java.util.Scanner;

public class Problem_07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first number:");
        int num1,num2;
        num1=input.nextInt();
        System.out.print("enter the second number:");
        num2=input.nextInt();
        int temp;
        temp=num2;
        num2=num1;
        num1=temp;
        System.out.println("values after swapping is:");
        System.out.println(num1);
        System.out.println(num2);



    }
}
