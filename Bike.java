package interviewQues.carBikeParking;

public class Bike extends Vehicle{
    String vehicleType;
    public Bike(String registrationNum) {
        super(registrationNum);
        vehicleType=this.getType();
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
