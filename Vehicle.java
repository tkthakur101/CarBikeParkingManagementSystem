package interviewQues.carBikeParking;

import java.util.Objects;

public abstract class Vehicle {
    String registrationNum;

    public Vehicle(String registrationNum) {
        this.registrationNum = registrationNum;
    }
    public String getRegistrationNum() {
        return registrationNum;
    }

    public abstract String getType();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        return Objects.equals(this.registrationNum, other.registrationNum) && Objects.equals(this.getType(), other.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNum, getType());
    }
}
