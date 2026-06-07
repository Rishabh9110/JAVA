import java.util.Scanner;

//Create a program to input  name of a person and respond with "welcome name to kg coding"
public class PROBLEM_02 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String Name=input.nextLine();
        System.out.println("welcome "+Name+" to kg coding");
    }

}



