import java.util.Scanner;

public class Point {
    int x, y;
    Scanner sc = new Scanner(System.in);
    public Point(){

    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public void input(Point p){
        System.out.println("x: ");
        p.x = sc.nextInt();
        System.out.println("y: ");
        p.y = sc.nextInt();
    }

    public void output(Point p){
        System.out.println("x: "+p.x+", y: "+p.y);
    }
}
