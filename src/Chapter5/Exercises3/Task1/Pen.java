package Chapter5.Exercises3.Task1;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; };
        @Override public String toString() { return color; }
    }

    private boolean capON = true;
    private Color currentColor;

    public Pen(Color color){
        this.currentColor = color;
    }

    public String draw(){
        if (!capON){
            return "Drawing " + currentColor;
        }
        return "";
    }

    public void capOff(){
        this.capON = false;
    }

    public void capOn(){
        this.capON = true;
    }

    public void changeColor(Color color){
        this.currentColor = color;
    }

}
