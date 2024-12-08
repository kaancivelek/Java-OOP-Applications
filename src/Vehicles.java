

    //INTERFACES
    interface Vehicles {
        int speed=120;
        String color="blue";

        void turnIt();
        void drive();
    }

    interface TurboEngine{void hyperSpeed();}
//INTERFACES

    //KIND

    //TWOWHEEL
    class TwoWheel{void makeBalance(){System.out.println("Balanced");}}
    //TWOWHEEL

    //ENGINE USING
    //ABSTRACTIONS
    abstract class EnginedVehicle{
        int enginepower;
        //fuel
        Fuel gasoline =new Fuel();
        //engine
        Engine engine =new Engine();

        void EnginedVehicle(){
            troubleCheck();
        }

        void startEngine(int a){Boolean status = troubleCheck();if(status){System.out.println("Trouble not found.");}}
        Boolean troubleCheck(){return true;}


    }
    //ABSTRACTIONS
    //ENGINEUSING

//KIND

//COMPONENTS

    // ENGINE
    class Engine{
        int sizeOfengine = 1400;


        void Engine(){gearSet gS = new gearSet();
        gS.run();
        }

        class gearSet{ void run(){System.out.println("Gearset Running.");}}
    }
    //ENGINE

    //FUEL
    class Fuel{ String fuelType="diesel";}
    //FUEL

//COMPONENTS


//Vehicles

    class Motorcycle extends EnginedVehicle implements Vehicles, TurboEngine{
        @Override
        public void turnIt() {
            System.out.println("Motorcycle is working.");

        }

        @Override
        public void drive() {
            System.out.println("Motorcycle Driving.");
        }
        @Override
        public void startEngine(int a){}

        @Override
        public void hyperSpeed() {
            System.out.println("Motorcycle's hyperspeed module is working.");

        }
    }

class Bicycle extends TwoWheel implements Vehicles {
        String model;

    @Override
    public void turnIt() {System.out.println("Seated on bicycle.");}

    @Override
    public void drive() {System.out.println("Bicycle pedals is turning");}
}

//Vehicles





