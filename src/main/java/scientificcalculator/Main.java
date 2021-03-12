package scientificcalculator;
import java.util.Scanner;
import java.lang.Math;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;


public class Main {
  //  private static final Logger logger = LogManager.getLogger(Main.class);
    public static double square_root(double x) {
  //      logger.info("Square root operation for value "+ x);
        return Math.sqrt(x);
    }

    public static long factorial(int number) {
  //      logger.info("Factorial root operation for value "+ number);
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;

    }

    public static double natural_log(double number){

    //    logger.info("Natural Logarithm operation for value "+ number);
        return Math.log(number);
    }

    public static double power(double base, double exponent){
    //    logger.info("Power operation for base as " + base + " and exponent as "+ exponent);
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char input;
        do {
            System.out.println("************************ OPERATIONS MENU *************************");
            System.out.println("Enter your choice :");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");

            // n
            int choice = reader.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Enter the number to calculate square root :");
                    double x = reader.nextDouble();
                    System.out.println("Answer: " +square_root(x));
                    break;

                case 2:
                    System.out.println("Enter the number to calculate factorial : ");
                    int y = reader.nextInt();
                    System.out.println("Answer: " + factorial(y));
                    break;

                case 3:
                    System.out.print("Enter the number to calculate natural logarithm :");
                    double z = reader.nextDouble();
                    System.out.println("Answer: "+ natural_log(z));
                    break;

                case 4:
                    System.out.println("Enter the base and the exponent :");
                    double a = reader.nextDouble();
                    double b = reader.nextDouble();
                    System.out.println("Answer: "+ power(a, b));
                    break;


                default:
      //              logger.warn("Incorrect option is chosen");
                    System.out.println("Error! Choice is not correct");
                    return;
            }
            System.out.println("Want to perform more operations??(Enter Y/y for yes)");
            input = reader.next().charAt(0);
        } while (input == 'Y' || input == 'y');
    }
}