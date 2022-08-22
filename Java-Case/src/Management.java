import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Management {

    public Management(){

    }

    public void getDailyEarning(ArrayList<Vehicle> records, Date date){

        SimpleDateFormat dayFormatter = new SimpleDateFormat("dd-MM-yyyy"); // Formatter class


        int totalEarning = 0;
        System.out.println("Date : "+ dayFormatter.format(date));

        for (Vehicle vehicle : records)
        {
            for (Date passDate : vehicle.passDates)
            {
                if (dayFormatter.format(passDate).equals(dayFormatter.format(date))){
                    System.out.println("Passed "+vehicle.type+" is : "+vehicle.HGSNumber);
                    totalEarning += BoxOffice.getVehiclePrice(vehicle.type);
            }

        }

    }
        System.out.println("Total Earning : "+ totalEarning);
    }


}
