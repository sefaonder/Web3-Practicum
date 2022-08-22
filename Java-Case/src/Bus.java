public class Bus extends Vehicle{

    public Bus() {
        super();
    }

    public Bus(Integer balance, VehicleType type, String HGSNumber, String Name, String Surname ){
        this.balance = balance;
        this.type = type;
        this.HGSNumber=HGSNumber;
        this.Name= Name;
        this.Surname= Surname;
    }
}
