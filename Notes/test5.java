interface Colorable {
    void setColor(String color);
    float calculateArea(int r);
}

class Circle implements Colorable {
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public float calculateArea(int r) {
        return (float)(Math.PI * r * r);
    }

    public void display() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea(5));
    }
}



public class test5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Red");
        circle.display();

       
    }
}