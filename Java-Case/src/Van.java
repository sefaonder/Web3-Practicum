public class Van extends Vehicle {

    public Van() {
        super();
    }

    public Van (Integer balance, VehicleType type, String HGSNumber, String Name, String Surname ){
        this.balance = balance;
        this.type = type;
        this.HGSNumber=HGSNumber;
        this.Name= Name;
        this.Surname= Surname;
    }
}
