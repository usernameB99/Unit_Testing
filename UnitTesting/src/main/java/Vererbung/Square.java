package Vererbung;

public class Square extends Shape {

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double length;

    public Square(String color, boolean isFilled, double length) {
        super(color, isFilled);
        this.length = length;
    }

    private double squareArea(){
        double area = 0;
        double length = this.length;

        if (this.length <= 0){
            throw new IllegalArgumentException("bitte geben soe einen wer über 0 ein");
        }

        area = (length * length);

        return area;
    }

    private double squareScope(){
        double scope = 0;
        double length = this.length;

        if (this.length <= 0){
            throw new IllegalArgumentException("bitte geben soe einen wer über 0 ein");
        }

        scope = (length + length) * 2;

        return scope;
    }

    @Override
    public double getArea() {
        return squareArea();
    }

    @Override
    public double getPerimeter() {
        return squareScope();
    }

}
