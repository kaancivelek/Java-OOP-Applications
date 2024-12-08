import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        System.out.println("""
                Choose your snippet;
                1-Cash Register
                2-GPS Receiver
                3-Geometric Objects
                4-University Student
                5-Vehicles
                """);
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                //Cashier cashier = new Cashier();cashier.workPeriod();
            Cashier cashier2 = new Cashier("Kaan"); cashier2.workPeriod();
            break;

            case 2:GpsReceiver gpsReceiver = new GpsReceiver();
            while (!gpsReceiver.status) {gpsReceiver = new GpsReceiver();}
            Satellite satellite = new Satellite();
            Satellite satellite2 = new Satellite(gpsReceiver);
            break;

            case 3:
            Circle circle = new Circle();
            circle.setRadius(2);
            circle.circleInfo();

            Rectangle rectangle = new Rectangle();
            rectangle.setHeight(2);
            rectangle.setWidth(3);
            rectangle.rectangleInfo();
                break;

                case 4: UniStudent student =new SoftwareEngineering(232805001,"Kaan","Civelek","18.09.2023");
                student.showStudentInformations();
                break;

            case 5: Bicycle bicycle = new Bicycle();
            bicycle.turnIt();
            bicycle.makeBalance();
            bicycle.drive();
                System.out.println(" ");
            Motorcycle motorcycle = new Motorcycle();
            motorcycle.turnIt();
            motorcycle.troubleCheck();
            motorcycle.hyperSpeed();
            motorcycle.drive();
            break;
        }
        }
    }
