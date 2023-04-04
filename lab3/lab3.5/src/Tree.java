import java.util.List;
import java.util.Objects;

class Tree {
    private List<Leaf> leaves;
    private boolean isBlooming; // зацвести
    private boolean hasFrost; // иней
    private boolean isYellowing; // Пожелтеть
    public Tree(List<Leaf> leaves) {
        this.leaves = leaves;
        this.isBlooming = false;
        this.hasFrost = false;
        this.isYellowing = false;
    }
    public void bloom() {
        this.isBlooming = true;
    }
    public void fallLeaves() {
        this.leaves.clear();
    }
    public void frost() {
        this.hasFrost = true;
    }
    public void yellowLeaves() {
        this.isYellowing = true;
    }
    public List<Leaf> getLeaves() {
        return leaves;
    }
    public boolean isBlooming() {
        return isBlooming;
    }
    public boolean hasFrost() {
        return hasFrost;
    }
    public boolean isYellowing() {
        return isYellowing;
    }
    @Override
    public String toString() {
        return "Tree{" +
                "leaves=" + leaves +
                ", isBlooming=" + isBlooming +
                ", hasFrost=" + hasFrost +
                ", isYellowing=" + isYellowing +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree)) return false;
        Tree tree = (Tree) o;
        return isBlooming == tree.isBlooming &&
                hasFrost == tree.hasFrost &&
                isYellowing == tree.isYellowing &&
                Objects.equals(leaves, tree.leaves);
    }
    @Override
    public int hashCode() {
        return Objects.hash(leaves, isBlooming, hasFrost, isYellowing);
    }
}