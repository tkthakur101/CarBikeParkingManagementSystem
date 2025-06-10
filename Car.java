package interviewQues.carBikeParking;

public class Car extends Vehicle{
    String vehicleType;
    public Car(String registrationNum) {
        super(registrationNum);
        vehicleType = this.getType();
    }

    @Override
    public String getType() {
        return "Car";
    }
}
