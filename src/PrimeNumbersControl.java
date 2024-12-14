import java.util.Scanner;
public class PrimeNumbersControl {

    public static boolean primeNumberChecker() {
ExpectionHandlerForPrimeNumbersControlClass scanner = new ExpectionHandlerForPrimeNumbersControlClass();
        System.out.println("Enter a number.");
        int number = scanner.PrimeNumbersExpectionHandler();
        if(number==1){return false;}
        for (int i = 2; i < number/2; i++) {if(number%i==0){return false;}}

        return true;
    }
}

class ExpectionHandlerForPrimeNumbersControlClass{
    Scanner scanner = new Scanner(System.in);

    int PrimeNumbersExpectionHandler() {
        boolean isValid = false;
        String input;
        int output=0;

        while (!isValid) {
            input = scanner.nextLine();
            try {output = Integer.parseInt(input);
                isValid = true;
            if(output<=0){System.out.println("Please enter a number bigger than zero.");isValid = false;}

            }

            catch (NumberFormatException e) {System.out.println("Please enter a valid number");}
        }
        return output;

    }}