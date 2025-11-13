package laskin;

import java.util.Scanner;
import java.util.logging.Logger;

public class Laskin {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Laskin.class.getName());
        Scanner sc = new Scanner(System.in);
        logger.info("Enter first number: ");
        int num1 = sc.nextInt();
        logger.info("Enter second number: ");
        int num2 = sc.nextInt();

        double sumResult = addValue(num1 + num2);
        logger.info(()->"Sum result is: " + sumResult);

        double subResult = subtractValue(num1 - num2);
        logger.info(()->"Sub result is: " + subResult);

        double mulResult = multiplyValue(num1 * num2);
        logger.info(()->"Mul result is: " + mulResult);

        double divResult = divideValue(num1 , num2);
        logger.info(()->"Div result is: " + divResult);

    }
    public static double addValue(int value) {
        return value;
    }
    public static double subtractValue(int value) {return value;}
    public static double multiplyValue(int value) {return value;}
    public static double divideValue(int num1 , int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) num1 / num2;
    }
    

}
