import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(150,VehicleType.CAR,"0001","Car1","Surname");
        Car car2 = new Car(170,VehicleType.CAR,"0004","Car2","Surname");

        Van van1 = new Van(250,VehicleType.VAN,"0002","Van1","Surname");

        Bus bus1 = new Bus(1050,VehicleType.BUS,"0003","Bus1","Surname");

        //Gişe Sınıfı
        BoxOffice boxOffice = new BoxOffice();

        Date date1 = new Date(); // Today

        // 3 days after
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE,3);

        Date date2 = c.getTime();


        boxOffice.passVehicle(car1,date1);
        boxOffice.passVehicle(car2,date2);

        boxOffice.passVehicle(van1,date1);

        boxOffice.passVehicle(bus1,date1);

        Management management = new Management();
        //gets vehicle records and search date return total earning in the days
        management.getDailyEarning(boxOffice.returnRecordsOfVehicles(),date1);


    }
}