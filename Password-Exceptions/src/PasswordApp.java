//Elia Schwartz, COP3330C-33777, May 23,2025
/*Purpose: The purpose of this code is to learn how to incorporate exceptions in a program to
prevent errors using try-catch blocks.*/
//The user inputs are unique usernames and passwords that obey the rules.
// Output will display that both are accepted and created for each personnel.

import java.util.Scanner;
public class PasswordApp {
    public static void main(String[] args) {

        //initializing the userCredentials and userSecret are used to hold the user input.
        String userCredentials;
        String userSecret;

        //Variable to hold the number of iterations in the while loop.
        int count = 0;

        //Creating an array object will have four indexes for each PasswordVerify object.
        PasswordVerify[] personnel = new PasswordVerify[4];
        while(count < 4){
            //Creating a Scanner object to get the user information.
            Scanner login = new Scanner(System.in);
            try {
                System.out.println("To create a username it must be EXACTLY 10 characters long, contain a Capitalized 'P' and a star character '*' ");
                System.out.println("somewhere in your username.");
                System.out.println("Create your username: ");
                userCredentials = login.nextLine();

                System.out.println("To create a password, you must follow the following rules: MUST be 8-15 character long and CONTAINS the word 'travel' ");
                System.out.println("in ALL LOWERCASE somewhere in the password.");
                System.out.println("Create your password: ");
                userSecret = login.nextLine();

                //Creating a PasswordVerify object with userCredentials and userSecret as parameters.
                PasswordVerify individual = new PasswordVerify(userCredentials, userSecret);

                //Reassigning variables
                    individual.accountName = userCredentials;
                    individual.password = userSecret;

                System.out.println();

                //Checks to see if the username and password follows the requirements.
                if(individual.isAcceptableUsername() && individual.isPasswordAcceptable()){
                    //Store the individual in the personnel array at the current index.
                    personnel[count] = individual;
                    count++;
                    System.out.println("Personnel " + count + " has created their credentials.");
                    System.out.println("-------------------------------------------------------------------------------------");
                }
            }
            //Handles the PasswordVerifyException by displaying a certain message to the user.
            catch (PasswordVerifyException e) {
                System.out.println(e.getMessage());
            }
        }
        //Iterate through the personnel array and display that each personnel created their username and password.
        for (int i = 0; i < personnel.length; i++) {

            System.out.println("Personnel " + (i+1) + " have successfully created your username and password: " + personnel[i].getAccountName() +
                    ", " + personnel[i].getPassword());
        }
    }
}
