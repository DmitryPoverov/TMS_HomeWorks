package HW.Task7;

abstract public class Shape {

    private String color;

    public Shape() {
    }

    public Shape (String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    abstract void draw();
}
