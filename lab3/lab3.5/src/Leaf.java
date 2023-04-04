import java.util.Objects;

class Leaf {
    private String color;
    private String shape;
    public Leaf(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }
    public String getColor() {
        return color;
    }
    public String getShape() {
        return shape;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }
    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Leaf)) return false;
        Leaf leaf = (Leaf) o;
        return Objects.equals(color, leaf.color) &&
                Objects.equals(shape, leaf.shape);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color, shape);
    }
}