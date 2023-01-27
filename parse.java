// importing the scanner library 
import java.util.Scanner;

public class parse {
    public static void main (String[] args) {
        // initializing scanner
        Scanner scnr = new Scanner (System.in);
        
        //variable declarations
        int timeHour; // time of travel hour 24hr format
        int timeMinute; // time of travel minute 
        int inputColon; // used to read time format 
        String userInput; // user specified time. Where I'm confused right now is that this variable is a string 
        double tollAmount;

        System.out.println("Enter time of travel (HH:MM in 24hr format");

        // read in an integer(hour) , colon (char), and integer (minute)
        // with built in string operators (discussed elsewhere);
        userInput = scnr.nextLine();
        inputColon = userInput.indexOf(":");
    
        //these boys below scare me
        // I tested my program with '06:30' 

        timeHour = Integer.parseInt(userInput.substring(0,inputColon));

        timeMinute = Integer.parseInt(userInput.substring(inputColon + 1,
        userInput.length()));

        //determine toll based on hour of travel

        if (timeHour < 6 ) {
            tollAmount = 1.55; //before 6am

        }
        else if (timeHour < 10) { 
            tollAmount  = 4.65; //after 10am
        }
        else if (timeHour < 18) {
            tollAmount = 2.35;
        } 
        else {
            tollAmount = 1.55;
        }

        //output time and toll amount 
        System.out.print("Toll at " + timeHour + ":");

        System.out.print(String.format("%02d", timeMinute));
        System.out.print(" is " + tollAmount);


    }
}