Circle createUnitCircle(Point p, Point q) {
    Point m = p.midPoint(q);
    double theta = p.angleTo(q);
    double mp = p.distanceTo(q) / 2;
    double d = Math.sqrt(1 - (mp * mp));
    Point c = m.moveTo(theta + (Math.PI / 2),d);

    if (mp > 1) {
        return new Circle(c,0);
    } else {
        return new Circle(c,1);
    }
}

int findMaxDiscCoverage(Point[] points) {
    int maxDiscCoverage = 0;
    for (int i = 0;i < points.length - 1;i++) {
        Point A = points[i];
        for (int j = i + 1;j < points.length;j++) {
            Point B = points[j];
            Circle C = createUnitCircle(A,B);
            if ( C.getRadius() == 0 ) {
                continue;
            } else {
                int count = 2;
                for (Point point:points) {
                    if (point == A || point == B) {
                        continue;
                    } else if (point.distanceTo(C.getCentre()) <= 1) {
                        count += 1;
                    } else {
                        continue;
                    }
                }
                if (count>maxDiscCoverage) {
                    maxDiscCoverage = count;
                }
            }
        }
    }
    return maxDiscCoverage;
}		









