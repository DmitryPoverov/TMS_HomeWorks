package HW2_Nasledovanie.Utils;

public enum VehicleBrand {

    MAZDA (200, "Japan"),
    VOLVO (130, "Sweden"),
    BOEING (900, "USA"),
    AIRBUS (920, "Europe");

    int maxSpeed;
    String country;

    VehicleBrand(int maxSpeed, String country) {
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getCountry() {
        return country;
    }
}
