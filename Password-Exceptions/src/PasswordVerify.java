//Class and methods to determine if a username and password are valid.
public class PasswordVerify {
    protected String accountName;
    protected String password;

    //Constructor with attributes as parameters
    public PasswordVerify(String accountName, String password)  {
        this.accountName = accountName;
        this.password = password;
    }

    //Lines 13-31 are the getter and setter methods
    public String getAccountName()
    {
        return accountName;
    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    //See if the username fixes the criteria, display that the account name can be used; return true.
    // if not throw an exception with the corresponding error message.
    public boolean isAcceptableUsername() throws PasswordVerifyException {
       if(!( accountName.length() == 10))
        {
            throw new PasswordVerifyException(accountName, "", "your account name doesn't contain the correct number of characters." +
                    " It currently has " + accountName.length() + " characters in length.");
        }
        if(!(accountName.contains("P") && accountName.contains("*")))
        {
            throw new PasswordVerifyException(accountName, "", " your account name doesn't contain a capital P and a star symbol.");
        }
            System.out.println("The account name: " + this.accountName + " is acceptable to use.");
            return true;
    }

    //See if the Password fixes the criteria, displays the password is accepted to use; return true.
    // if not throw an exception with the corresponding error message.
    public boolean isPasswordAcceptable() throws PasswordVerifyException
    {
        if(!(password.length() >= 8 && password.length() <=15))
        {
            throw new PasswordVerifyException("", password, "due to the lack of correct number of characters. " +
                    "You have " + password.length() + " characters in length.");
        }
        if(!(password.contains("travel")))
        {
            throw new PasswordVerifyException("", password, "the word travel isn't found in the password.");
        }
            System.out.println("Password: " + this.password + " is accepted");
            return true;
    }
}