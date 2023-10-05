package Vererbung;

public class Rectangle extends Shape {

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double length;

    private double width;

    public Rectangle(String color, boolean isFilled, double length, double width) {
        super(color, isFilled);
        this.length = length;
        this.width = width;
    }

    private double rectangleArea(){
        double area = 0;
        double length = this.length;
        double width = this.width;

        if (this.length <= 0 || this.width <= 0){
            throw new IllegalArgumentException("bitte geben soe einen wer über 0 ein");
        }

        area = (length * width);

        return area;
    }

    private double rectangleScope(){
        double scope = 0;
        double length = this.length;
        double width = this.width;

        if (this.length <= 0 || this.width <= 0){
            throw new IllegalArgumentException("bitte geben soe einen wer über 0 ein");
        }

        scope = (length + width) * 2;

        return scope;
    }

    @Override
    public double getArea() {
        return rectangleArea();
    }

    @Override
    public double getPerimeter() {
        return rectangleScope();
    }
}
