import java.util.Scanner;

public class TriangleCreator {
    double border1;
    double border2;
    double border3;
    ExpectionHandlerForTriangle triangleExpectionHandler = new ExpectionHandlerForTriangle();



public TriangleCreator(){

    System.out.println("Enter first length of triangle border:");
     this.border1 = triangleExpectionHandler.safeScannerForLength();

    System.out.println("Enter second length of triangle border:");
     this.border2 = triangleExpectionHandler.safeScannerForLength();

    System.out.println("Enter third length of triangle border:");
    this.border3 = triangleExpectionHandler.safeScannerForLength();


    if(ExpectionHandlerForTriangle.isCanBeTriangle(border1,border2,border3)){
        System.out.println("Triangle created");}
    else{
        System.out.println("Triangle creation failed, check lengths of borders");
        System.out.println("length of borders: "+border1+","+border2+","+border3);
    }
}

}


class ExpectionHandlerForTriangle{

   public double safeScannerForLength(){
    Scanner scanner = new Scanner(System.in);
    boolean isValid = false;
    String input;
    double output=0;
        while (!isValid) {
        input = scanner.nextLine();
        try {output = Double.parseDouble(input);isValid = true;
            if(output<=0){System.out.println("length cannot be equal or less than 0");isValid = false;}
        }
        catch (NumberFormatException e) {System.out.println("Please enter a valid number");}
    }

        return output;
}


    public static boolean isCanBeTriangle(double border1,double border2,double border3){
        try{
        if(!(border1+border2>border3&&border1+border3>border2&&border2+border3>border1)) {
            throw new IllegalArgumentException("Can't be a triangle with this borders");}
        }

        catch (IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
            return false;
        }

        return true;
    }

}