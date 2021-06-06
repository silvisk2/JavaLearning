import java.util.Scanner;

public class javaProgram {

    public static void main(String[] args) {

        // primitive types below
        int age = 28;
        double GPA = 5.0;
        //char firstInitial = firstName.charAt(0);
        char lastInitial = 'C';
        boolean male = true;

        // reference types

//        String firstName = "Silviu";
//        String lastName = "Capraru";
        //char firstInitial = firstName.charAt(0);
       // System.out.println(firstInitial);

        // Concatenating strings in Java

        double studentGPA = 3.55;
        String firstName = "Silviu";
        String lastName = "Capraru";
        System.out.println(firstName + " " + lastName + "has a GPA of " + studentGPA);

        // Output & Input

        System.out.println("What do you want to update it to ?");
        Scanner input  = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println(firstName + " " + lastName + "now has a GPA of " + studentGPA);
    }

}
