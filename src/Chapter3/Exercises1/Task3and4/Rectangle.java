package Chapter3.Exercises1.Task3and4;

public class Rectangle extends Shape{
    double width;
    double height;
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String calculateArea() {
        return "Area of Rectangle with width: "+getWidth()+" and height: "+getHeight()+" is: "+this.height * this.width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
