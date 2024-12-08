import java.util.Scanner;

class SafeScannerForInt {
    Scanner scanner = new Scanner(System.in);


    int numberFormatExpectionHandler() {
        boolean isValid = false;
        String input;
        int output=0;
        while (!isValid) {
            input = scanner.nextLine();
            try {output = Integer.parseInt(input);isValid = true;}
            catch (NumberFormatException e) {System.out.println("Please enter a valid number");}
        }

        return output;

    }
}