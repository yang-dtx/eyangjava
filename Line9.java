public class Line9 {
    Point p1;
    Point p2;
    public Line(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public Point getp1(){
        return p1;
    }
    public Point getp2(){
        return p2;
    }
    public String toString() {
        return "[" + p1.toString() + ", " + p2.toString() + "]";
    }
    public double getSlope() {
        if(p1.getX() == p2.getX())
            throw new IllegalStateException();
            
        return ((double)(p2.getY() - p1.getY())) / (p2.getX() - p1.getX());
    }
    public Line(int x1, int y1, int x2, int y2) {
        p1 = new Point();
        p2 = new Point();
        p1.setLocation(x1, y1);
        p2.setLocation(x2, y2);
    }
    public boolean isCollinear(Point p) {
        double slope1 = (double)(p1.getY() - p.getY()) / (p1.getX() - p.getX());
        double slope2 = (double)(p2.getY() - p.getY()) / (p2.getX() - p.getX());
        return slope1 == slope2;
    }
}
