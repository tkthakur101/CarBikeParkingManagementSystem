package interviewQues.carBikeParking;

import java.util.LinkedList;
import java.util.List;

public class VehicleParking {

    public static void parkVehicles(List<Vehicle> vehicles, LinkedList<Vehicle> carSlot, LinkedList<Vehicle> bikeSlot, final int MAX_CAPACITY) {
        for (Vehicle vehicle : vehicles) {
            switch (vehicle.getType()) {
                case "Car":
                    if (carSlot.size() <= MAX_CAPACITY) {
                        carSlot.add(vehicle);
                    }
                    break;
                case "Bike":
                    if (bikeSlot.size() <= MAX_CAPACITY) {
                        bikeSlot.add(vehicle);
                    }
                    break;
            }
        }
    }

    public static void releaseVehicles(List<Vehicle> vehicles, LinkedList<Vehicle> carSlot, LinkedList<Vehicle> bikeSlot, final int MAX_CAPACITY) {
        for (Vehicle vehicle : vehicles) {
            switch (vehicle.getType()) {
                case "Car":
                    carSlot.remove(vehicle);
                    break;
                case "Bike":
                    bikeSlot.remove(vehicle);
                    break;
            }
        }
    }
}
