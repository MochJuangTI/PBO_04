package Square;

import Shape.Shape;

public class Square extends Shape {
    protected Double side;

    protected  String name;
    public Square(String name, Double side){
        this.name = name;
        this.side = side;
        this.calculateArea();
    }
    public void calculateArea() {
        super.area  = this.side * this.side;
    }

    public void getInfo() {
        System.out.println("Square " + name + " info");
        System.out.println(" area: " + super.area);
        System.out.println(" with side : " +  side);
        System.out.println();
    }
}
