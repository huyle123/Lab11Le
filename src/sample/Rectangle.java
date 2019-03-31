package sample;

public class Rectangle extends Shape{
    private Point point2;
    private Point point3;
    private Point point4;
    public Rectangle() {
        p1 = new Point(0,0);
        point2 = new Point(1,0);
        point3 = new Point(1,1);
        point4 = new Point(0,1);
        System.out.println("Rectangle Point 1: (" + p1.x+ ","+p1.y + ")");
        System.out.println("Rectangle Point 2: (" + point2.x+ "," + point2.y + ")");
        System.out.println("Rectangle Point 3: (" + point3.x+ "," + point3.y + ")");
        System.out.println("Rectangle Point 4: (" + point4.x+ "," + point4.y + ")" + "\n");
    }
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super();
        p1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        System.out.println("Rectangle Point 1: (" + p1.x + "," + p1.y + ")");
        System.out.println("Rectangle Point 2: (" + point2.x + "," + point2.y + ")");
        System.out.println("Rectangle Point 3: (" + point3.x + "," + point3.y + ")");
        System.out.println("Rectangle Point 4: (" + point4.x + "," + point4.y + ")" + "\n");
    }
}
