package Vererbung;

public class Circle extends Shape {


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double radius;

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    private double circleArea(){
        double area = 0;
        double radius = this.radius;

        if (this.radius <= 0){
            throw new IllegalArgumentException("bitte geben soe einen wer über 0 ein");
        }

        area = (radius * radius) * Math.PI;

        return area;
    }

    private double circleScope(){
        double scope = 0;
        double radius = this.radius;

        if (this.radius <= 0){
            throw new IllegalArgumentException("bitte geben soe einen wer über 0 ein");
        }

        scope = 2 * radius * Math.PI;

        return scope;
    }

    @Override
    public double getArea() {
        return circleArea();
    }

    @Override
    public double getPerimeter() {
        return circleScope();
    }





}
