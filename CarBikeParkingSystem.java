package interviewQues.carBikeParking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class CarBikeParkingSystem {
    private static final int MAX_CAPACITY = 100;
    static  LinkedList<Vehicle> carParkingSlot;
    static LinkedList<Vehicle> bikeParkingSlot;
    public static void main(String[] args) {
       carParkingSlot = new LinkedList<>();
       bikeParkingSlot = new LinkedList<>();

        List<Vehicle> incomingVehicles = getVehicleDetails();
        List<Vehicle> exitingVehicles = getReleaseVehicleDetails();

        VehicleParking.parkVehicles(incomingVehicles, carParkingSlot, bikeParkingSlot, MAX_CAPACITY);
        VehicleParking.releaseVehicles(exitingVehicles, carParkingSlot, bikeParkingSlot, MAX_CAPACITY);

        System.out.println("Available parking slots - Car: " + (MAX_CAPACITY - carParkingSlot.size()) +
                ", Bike: " + (MAX_CAPACITY - bikeParkingSlot.size()));
    }

    private static List<Vehicle> getVehicleDetails() {
        return Arrays.asList(
                new Car("123"),
                new Car("124"),
                new Car("125"),
                new Car("126"),
                new Bike("200"),
                new Bike("201")
        );
    }

    private static List<Vehicle> getReleaseVehicleDetails() {
        return Arrays.asList(
                new Car("125"),
                new Bike("200")
        );
    }
}