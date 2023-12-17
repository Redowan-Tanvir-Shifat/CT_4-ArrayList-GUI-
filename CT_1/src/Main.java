import java.util.Scanner;

class Point{
    int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Rectangle{
    Point p1;
    Point p2;
    Point p3;
    Point p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;

    }

    public boolean checkPoint(Point p) {
        if ((p1.x <= p.x && p2.x >=p.x) && (p1.y <= p.y && p4.y >= p.y)) {
            return true;
        }
        return  false;
    }

    public boolean checkRectangle(Rectangle r2) {
        if(checkPoint(r2.p1) && checkPoint(r2.p2) && checkPoint(r2.p3) && checkPoint(r2.p4)) {
            return true;
        }
        return false;
    }

}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Point p = new Point(x, y);

        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 3);
        Point p3 = new Point(5, 5);
        Point p4 = new Point(2, 5);
        Rectangle r1 = new Rectangle(p1, p2, p3, p4);

        Point P1 = new Point(2,4);
        Point P2 = new Point(4,4);
        Point P3 = new Point(4,5);
        Point P4 = new Point(2,5);
        Rectangle r2 = new Rectangle(P1, P2, P3, P4);

        System.out.println(r1.checkPoint(p));
        System.out.println(r1.checkRectangle(r2));

    }

}