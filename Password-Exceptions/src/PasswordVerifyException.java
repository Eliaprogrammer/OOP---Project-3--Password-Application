//Method that controls the message when an error occurs.
public class PasswordVerifyException extends Exception{
    public PasswordVerifyException(String username, String password, String reason)
    {
        //The output that is displayed to the user when an error happens in the main method.
        super("The username or password you created can not be recognized by the system; " + reason + "\nUsername: " +
                username + "\nPassword: "+ password);
    }
}
