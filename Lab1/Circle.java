public class Circle { 
    private final double radius;
    private final Point centre;

    public Circle(Point centre,double radius) { 
        this.radius = radius;
        this.centre = centre;
    }

    /**
    *This method is used to draw the circle.
    */
    public static Circle getCircle(Point centre,double radius) { 
        return new Circle(centre,radius);
    }

    public Point getCentre() { 
        return this.centre;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() { 
        return "circle of radius " + radius + " centered at " + centre;
    }
}
