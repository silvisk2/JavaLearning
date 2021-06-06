import java.util.Scanner;

public class functionInJava {

public static void announceDeveloperTeaTime() {

    System.out.println("Waiting for dev tea time...");
    System.out.println("Type in a random word and Press Enter");
    Scanner input = new Scanner(System.in);
    input.next();
    System.out.println("It's dev time");

}
    public static void main(String[] args) {

        System.out.println("Welcome to your new job");
    announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();
        System.out.println("Get promoted!");

    }

}

