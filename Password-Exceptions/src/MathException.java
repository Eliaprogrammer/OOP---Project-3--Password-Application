//Simple example of arithmeticException with try -catch block.

import java.util.Scanner;
public class MathException {
    //Attributes declaring
    protected int num1;
    protected int num2;
    protected double answer;

    //Constructor
    public MathException(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    //Lines 18-34 are the getter and setter methods.
    public int getNum1()
    {
        return num1;
    }
    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public static void main(String[] args) {

        //Instancing Math exception object
        MathException equation = new MathException(0,0);

        //Implementing a try-catch block.
        try {
            //Get data from the user.
            System.out.println("Please enter a number");
            Scanner userNumber = new Scanner(System.in);
            equation.num1 = userNumber.nextInt();
            System.out.println("Please enter another number");
            equation.num2 = userNumber.nextInt();


            //Checks the user second number is equal to zero.
            if(equation.num2 == 0){
                //exception with error
                throw new ArithmeticException("You can't divide " + equation.num1 + " by " + equation.num2);
            }
            else{
                //Runs with any number assign to num2.
                 equation.answer = (double) equation.num1 / equation.num2;
                 System.out.printf("When you divided %d / %d = %.2f", equation.num1, equation.num2, equation.answer);
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
    }
}
