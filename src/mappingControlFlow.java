import java.util.Locale;
import java.util.Scanner;

public class mappingControlFlow {
    public static void main(String[] args) {

        String question = "Which color is the car ?";
        String choiceOne = "blue";
        String choiceTwo = "red";
        String choiceThree = "yellow";

        String correctAnswer = choiceTwo;

        System.out.println(question);

        System.out.println("Choose one of the following:" + choiceOne + ", " + choiceTwo + ", " + choiceThree + ".");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(correctAnswer.equals(input.toLowerCase()))  {
            System.out.println("Congrats!");
        }
        else {
            System.out.println("You are incorrect" + correctAnswer);
        }



    }
    }


