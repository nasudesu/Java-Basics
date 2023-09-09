package Chapter3.Exercises1.Task3and4;

public class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public String calculateArea() {
        return "Area of Triangle with base: "+getBase()+" and height: "+getHeight()+" is: "+this.base * this.height / 2;
    }

    @Override
    public double getArea() {
        return this.base * this.height / 2;
    }
}
