import java.lang.reflect.Array;
import java.util.*;
import java.util.Set;
import java.util.TreeMap;
//7.	На плоскости задано N отрезков.
//        Найти точку пересечения двх отрезков, имеющую минимальную абсциссу. Использовать класс TreeMap
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the N lines");
        int n = scanner.nextInt();
        System.out.println("Input the coordinates of lines");
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            lines.add(new Line(new Point(x1, y1), new Point(x2, y2)));
        }
        TreeMap<Point, Line[]> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Line l1 = lines.get(i);
                Line l2 = lines.get(j);
                Point p = l1.getIntersection(l2);
                if (p != null) {
                    Line[] arr = {l1, l2};
                    treeMap.put(p, arr);
                }
            }
        }
        Point point = treeMap.firstKey();
        Line[] linesArr = treeMap.get(point);
        Line l1 = linesArr[0];
        Line l2 = linesArr[1];
        Point intersection = l1.getIntersection(l2);
        System.out.println(intersection.x + " " + intersection.y);
    }
    static class Point {
        double x, y;
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
