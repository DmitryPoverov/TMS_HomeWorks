package HW.Task5.com.company.details;

public class Engine {

    private int power;
    private String producer;

//    public Engine() {}

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public int getPower() {
        return power;
    }                                           // get-set power
    public void setPower(int power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }                                           // get-set producer
    public void setProducer(String producer) {
        this.producer = producer;
    }

}
