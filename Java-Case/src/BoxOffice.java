import java.util.ArrayList;
import java.util.Date;


public class BoxOffice {

    private ArrayList<Vehicle> recordsOfVehicles = new ArrayList<>();

    public void passVehicle(Vehicle vehicle, Date date){
        vehicle.passDates = new ArrayList<>();
        vehicle.passDates.add(date);
        vehicle.balance = vehicle.balance - getVehiclePrice(vehicle.type);

        recordsOfVehicles.add(vehicle);

        System.out.println("Balance :" + vehicle.balance);
    }

    public static int getVehiclePrice(VehicleType vehicle){
        return switch (vehicle) {
            case CAR -> 5;
            case VAN -> 10;
            case BUS -> 15;
        };

    }

    public ArrayList<Vehicle> returnRecordsOfVehicles(){
        /*
        for (Vehicle vehicle : this.recordsOfVehicles)
        {
            System.out.println("Vehicle-Info\n-------------------");
            System.out.println(vehicle.Name);
            System.out.println(vehicle.Surname);
            System.out.println(vehicle.balance);
            System.out.println(vehicle.type);
            System.out.println(vehicle.HGSNumber);
            System.out.println(vehicle.passDates);
        }
         */

        return this.recordsOfVehicles;
    }

}
