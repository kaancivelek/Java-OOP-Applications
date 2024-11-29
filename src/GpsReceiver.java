public class GpsReceiver {
    private int temperature;
    public Boolean status;
    private String gpsMassage;


    public GpsReceiver() {
        analyzeTemperature();
        if(temperature > 5&&temperature < 50) {status = true;}
    }


    private int analyzeTemperature() {
        temperature= (int)(Math.random()*39)+1;
        return temperature;
    }
    public void takeDatafromSatellite(int possibility) {
switch(possibility) {
    case 1: gpsMassage= "$GPGGA,N, 40, 30, E" ;break;
    case 2: gpsMassage= "$GPRMC, 41, N, E, 31" ;break;
    case 3: gpsMassage= "$GPGLL, N, E, 42, 32" ;break;
}
    }
    public String sendData(){
        return gpsMassage;
    }
}

class Satellite{

    public Satellite() {
        System.out.println("!WARNING! GPS signal is not found !WARNING!");
    }
    public Satellite(GpsReceiver gR) {
        System.out.println("GPS signal is found and connected.");
        gR.takeDatafromSatellite(chooseofdataType());

    }
    int chooseofdataType(){
        return (int)(Math.random()*2)+1;
    }
}

class GpsApplication{
   private String location;
   private String horizontal;
   private String vertical;

   public GpsApplication(GpsReceiver gR) {

       dataOflocation(gR.sendData());

   }
   private void dataOflocation(String location) {
       String []splittedData = location.split(",");
       location = splittedData[0];
       horizontal = splittedData[1]+splittedData[2];
       vertical = splittedData[3]+splittedData[4];

       System.out.println("location: " + location+"horizontal: " + horizontal+"vertical: " + vertical);

   }
}
