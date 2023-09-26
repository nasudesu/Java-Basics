package Chapter3.Exercises1.Task3and4;

public class ShapeCalculator {
    public static boolean areShapesCompatible(Shape shape1, Shape shape2) {
        boolean compatible = false;
        if (shape1.getArea() * 2 == shape2.getArea()) {
            compatible = true;
        }
        return compatible;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,6);
        Triangle triangle = new Triangle(3,8);

        Shape[] shapes = {circle,rectangle,triangle};

        for (Shape x : shapes){
            System.out.println(x.calculateArea());
        }


        //Task4
        System.out.println(areShapesCompatible(triangle, rectangle));
    }
}
