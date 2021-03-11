import java.util.Scanner;
import java.lang.Math;
class Function{
    static double square_root(double x) {
        return Math.sqrt(x);
    }
    static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;

    }
    static double natural_log(double number){
        return Math.log(number);
    }
    static double power(double base, double exponent){
        return Math.pow(base, exponent);
    }

}
class Main {

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
                    System.out.println("Answer: " +Function.square_root(x));
                    break;

                case 2:
                    System.out.println("Enter the number to calculate factorial : ");
                    int y = reader.nextInt();
                    System.out.println("Answer: " + Function.factorial(y));
                    break;

                case 3:
                    System.out.print("Enter the number to calculate natural logarithm :");
                    double z = reader.nextDouble();
                    System.out.println("Answer: "+ Function.natural_log(z));
                    break;

                case 4:
                    System.out.println("Enter the base and the exponent :");
                    double a = reader.nextDouble();
                    double b = reader.nextDouble();
                    System.out.println("Answer: "+ Function.power(a, b));
                    break;


                default:
                    System.out.println("Error! Choice is not correct");
                    return;
            }
            System.out.println("Want to perform more operations??(Enter Y/y for yes)");
            input = reader.next().charAt(0);
        } while (input == 'Y' || input == 'y');
    }
}