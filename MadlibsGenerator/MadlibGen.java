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
        System.out.print("Give me a fourth adjective: ");
        String fourthAdject = input.nextLine();
        System.out.print("Give me a fifth adjective: ");
        String fifthAdject = input.nextLine();
        System.out.print("Give me a song title: ");
        String songTitle = input.nextLine();
        System.out.print("Give me a food: ");
        String food = input.nextLine();
        System.out.print("Give me a sixth adjective: ");
        String sixthAdject = input.nextLine();
        System.out.print("Give me a past tense verb: ");
        String firstPastTenseVerb = input.nextLine();
        System.out.print("Give me a second noun: ");
        String secondNoun = input.nextLine();
        System.out.print("Give me a third noun: ");
        String thirdNoun = input.nextLine();
        System.out.print("Give me a another past tense verb: ");
        String secondPastTenseVerb = input.nextLine();
        System.out.print("Give me a third past tense verb: ");
        String thirdPastTenseVerb = input.nextLine();
        System.out.print("Give me a fourth noun: ");
        String fourthNoun = input.nextLine();
        System.out.print("Give me a fifth noun: ");
        String fifthNoun = input.nextLine();
        System.out.print("Give me a verb: ");
        String firstVerb = input.nextLine();
        System.out.print("Give me a second verb: ");
        String secondVerb = input.nextLine();
        System.out.print("Give me a third verb: ");
        String thirdVerb = input.nextLine();
        System.out.print("Give me a seventh adjective: ");
        String seventhAdject = input.nextLine();
        System.out.println("Here is your madlib "+name+" "+month+day+year);
        System.out.print("It was a "+firstAdject+" summer day."+firstNoun+" and I were excited to go camping at "+location+". It was my first time going there. I packed my favorite "+clothing+". It is "+secondAdject+" and "+thirdAdject+". Perfect for camping! On the road we went in our "+fourthAdject+" "+fifthAdject+" van! We were listening to "+songTitle+" all the way down. The drive was about 5 hours but it was so worth it. When we got there we unpacked the van. I could smell "+food+" being cooked. It smelled "+sixthAdject+". I "+firstPastTenseVerb+" to the room I was staying in with my "+secondNoun+". The next thing I knew, "+thirdNoun+" came and "+secondPastTenseVerb+" on the bed. I heard my mom scream, 'Get off the bed!' I "+thirdPastTenseVerb+" outside. I saw "+fourthNoun+". It was "+fifthNoun+". Over the next few days I got to "+firstVerb+", "+secondVerb+" ,and "+thirdVerb+". My camping trip was "+seventhAdject+".");
    }
}