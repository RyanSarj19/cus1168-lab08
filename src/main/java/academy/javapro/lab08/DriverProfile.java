package academy.javapro.lab08;

public class DriverProfile {
    private int age;
    private int accidentsInLastFiveYears;
    private String occupation;
    private String vehicleMake;
    private String vehicleModel;
    private int vehicleYear;
    
    // Other parameters are accepted but not used in this simple example.
    public DriverProfile(int age, int someNumber, String occupation, int accidentsInLastFiveYears, int unused,
                         String vehicleMake, String vehicleModel, int vehicleYear,
                         boolean b1, boolean b2, boolean b3,
                         int num1, int num2, int num3, boolean b4, boolean b5) {
        this.age = age;
        this.accidentsInLastFiveYears = accidentsInLastFiveYears;
        this.occupation = occupation;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getAccidentsInLastFiveYears() {
        return accidentsInLastFiveYears;
    }
    
    public String getVehicleMake() {
        return vehicleMake;
    }
    
    public String getVehicleModel() {
        return vehicleModel;
    }
    
    public int getVehicleYear() {
        return vehicleYear;
    }
}
