public class Point {
    private final double x;
    private final double y;

    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    /**
    *This method is used to find the midpoint of two points.
    */
    public Point midPoint(Point otherpoint) {
        double midX = (this.x + otherpoint.x) / 2;
        double midY = (this.y + otherpoint.y) / 2;
        return new Point(midX,midY);
    }

    public double angleTo(Point otherpoint) {
        return Math.atan2((otherpoint.y - this.y),(otherpoint.x - this.x));
    }

    /**
    *This method is used to move the point.
    */
    public Point moveTo(double theta,double d) {
        double newX = this.x + d * Math.cos(theta);
        double newY = this.y + d * Math.sin(theta);
        return new Point(newX,newY);
    }

    public double distanceTo(Point otherpoint) {
        return Math.sqrt(Math.pow(this.x - otherpoint.x,2) + Math.pow(this.y - otherpoint.y,2));
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return String.format("point (%.3f, %.3f)",x,y);
    }
}
