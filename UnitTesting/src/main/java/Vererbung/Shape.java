package Vererbung;

public abstract class Shape {

    private String color;

    private boolean isFilled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Shape (String color, boolean isFilled) {

        this.color = color;
        this.isFilled = isFilled;
    }
    public abstract double getArea();

    public abstract double getPerimeter();

}
