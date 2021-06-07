package HW6.Task4;

class Aspirant extends Student {

    private String scientificWork;

    public Aspirant (String firstName, String lastname, String group, double averageMark, String scientificWork) {
        super(firstName, lastname, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    int getScholarship() {
        if (getAverageMark()<5) {
            return 180;
        } else {
            return 200;
        }
    }

    public void getInfo() {
        System.out.printf("\nAbout aspirant:\n%s, %s, %s, %.1f, %s",
                getFirstName(), getLastName(), getGroup(), getAverageMark(), scientificWork);
    }
}
