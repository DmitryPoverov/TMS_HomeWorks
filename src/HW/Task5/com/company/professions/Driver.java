package HW.Task5.com.company.professions;

public class Driver {

    private String fIO;
    private int seniority;

    public Driver(String fIO, int seniority) {
        this.fIO = fIO;
        this.seniority = seniority;
    }

    public String getFIO() {
        return fIO;
    }                                           // get-set fIO
    public void setFIO(String fIO) {
        this.fIO = fIO;
    }

    public int getSeniority() {
        return seniority;
    }                                           // get-set seniority
    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

}