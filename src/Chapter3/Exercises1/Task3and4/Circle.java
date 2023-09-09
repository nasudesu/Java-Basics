package Chapter3.Exercises1.Task3and4;

public class Circle extends Shape{
    double radius;
    Circle(int radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String calculateArea(){
        return "Area of Circle with radius: "+getRadius()+": "+ Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
