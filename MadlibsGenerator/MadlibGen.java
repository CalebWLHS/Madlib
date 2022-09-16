import java.util.Scanner;
/**
 * Creates Madlib Generator with the Users Name and Date
 *
 * @author Caleb Rubow
 * @version 9/16/2022
 */
public class MadlibGen
{
   public static void main(String[] args){
       //name input
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String name = input.nextLine();
       //date input
       System.out.print("What is today's month?(use integers): ");
       int month = input.nextInt();
       System.out.print("What is day is it today?(use integers): ");
       int day = input.nextInt();
       System.out.print("What year is it?(use integers): ");
       int year = input.nextInt();
       input.nextLine();
       //madlib input
       System.out.println("Now let's do a Madlib together!");
       System.out.print("Give me an adjective: ");
       String firstAdject = input.nextLine();
       System.out.print("Give me a noun: ");
       String firstNoun = input.nextLine();
       System.out.print("Give me a location: ");
       String location = input.nextLine();
       System.out.print("Give me a piece of clothing: ");
       String clothing = input.nextLine();
       System.out.print("Give me another adjective: ");
       String secondAdject = input.nextLine();
       System.out.print("Give me a third adjective: ");
       String thirdAdject = input.nextLine();
   }
}
