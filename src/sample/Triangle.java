package sample;

public class Triangle extends Shape {
    private Point point2;
    private Point point3;

    public Triangle() {
        p1 = new Point(0, 0);
        point2 = new Point(0, 1);
        point3 = new Point(1, 0);
        System.out.println("Triangle Point 1: (" + p1.x + "," + p1.y + ")");
        System.out.println("Triangle Point 2: (" + point2.x + "," + point2.y + ")");
        System.out.println("Triangle Point 3: (" + point3.x + "," + point3.y + ")" + "\n");
    }

    public Triangle(Point point1, Point point2, Point point3) {
        p1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        System.out.println("Triangle Point 1: (" + p1.x + "," + p1.y + ")");
        System.out.println("Triangle Point 2: (" + point2.x + "," + point2.y + ")");
        System.out.println("Triangle Point 3: (" + point3.x + "," + point3.y + ")" + "\n");
    }
}

