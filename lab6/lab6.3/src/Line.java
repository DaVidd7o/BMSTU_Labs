public class Line {
    Main.Point p1, p2;
    Line(Main.Point p1, Main.Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    Main.Point getIntersection(Line l) {
        double x1 = p1.x, y1 = p1.y;
        double x2 = p2.x, y2 = p2.y;
        double x3 = l.p1.x, y3 = l.p1.y;
        double x4 = l.p2.x, y4 = l.p2.y;
        double d = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);
        if (d == 0) {
            return null;
        }
        double xi = ((x3 - x4) * (x1 * y2 - y1 * x2) - (x1 - x2) * (x3 * y4 - y3 * x4)) / d;
        double yi = ((y3 - y4) * (x1 * y2 - y1 * x2) - (y1 - y2) * (x3 * y4 - y3 * x4)) / d;
        if (xi < Math.min(x1, x2) || xi > Math.max(x1, x2)) {
            return null;
        }
        if (xi < Math.min(x3, x4) || xi > Math.max(x3, x4)) {
            return null;
        }
        return new Main.Point(xi, yi);
    }
}