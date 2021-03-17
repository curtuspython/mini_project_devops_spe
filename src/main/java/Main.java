import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double square_root(double x) {
        logger.info("square_root"+ x);
        return Math.sqrt(x);
    }

    public static long factorial(int number) {
        logger.info("Factorial root operation for value "+ number);
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;

    }

    public static double natural_log(double number){

        logger.info("Natural Logarithm operation for value "+ number);
        return Math.log(number);
    }

    public static double power(double base, double exponent){
        logger.info("Power operation for base as " + base + " and exponent as "+ exponent);
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char input;
        do {
            System.out.println("************************ OPERATIONS MENU *************************");
            System.out.println("Enter your choice :");
            System.out.println("1. Square Root Function");
            System.out.println("2. Factorial Function");
            System.out.println("3. Natural Logarithm Function");
            System.out.println("4. Power Function");
            try{
            // n
            char choice = reader.next().charAt(0);
            switch (choice) {
                case '1':

                    System.out.println("Enter the number to calculate square root :");
                    try{
                        double x = reader.nextDouble();
                        System.out.println("Answer: " +square_root(x));
                    }
                    catch(Exception ie){
                        logger.error("Input type mismatch.");
                        System.out.println("Enter correct double input only.:<");
                    }

                    break;

                case '2':
                    System.out.println("Enter the number to calculate factorial : ");
                    try {
                        int y = reader.nextInt();
                        System.out.println("Answer: " + factorial(y));
                    }
                    catch (Exception ie){
                        logger.error("Input type mismatch.");
                        System.out.println("Enter correct integer input only.:<");
                    }
                    break;

                case '3':
                    System.out.print("Enter the number to calculate natural logarithm :");

                    try{double z = reader.nextDouble();
                    System.out.println("Answer: "+ natural_log(z));}
                    catch (Exception ie){
                        logger.error("Input type mismatch.");
                        System.out.println("Enter correct double input only.:<");
                    }
                    break;

                case '4':
                    System.out.println("Enter the base and the exponent :");
                    try{
                    double a = reader.nextDouble();
                    double b = reader.nextDouble();
                    System.out.println("Answer: "+ power(a, b));}
                    catch(Exception ie){
                        logger.error("Input type mismatch.");
                        System.out.println("Enter correct double input only.:<");
                    }
                    break;


                default:
                    logger.warn("Incorrect option is chosen");
                    System.out.println("Error! Choice is not correct");
                    break;
            }
            System.out.println("Want to perform more operations??(Enter Y/y for yes)");}
            finally{
            input = reader.next().charAt(0);}
        } while (input == 'Y' || input == 'y');
    }
}