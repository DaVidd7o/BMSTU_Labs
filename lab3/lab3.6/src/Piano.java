import java.util.List;
import java.util.Objects;

class Piano {
    private List<Key> keys;
    private boolean isTuned;

    public Piano(List<Key> keys) {
        this.keys = keys;
        this.isTuned = false;
    }

    public void tune() {
        this.isTuned = true;
    }

    public void play() {
        if (!this.isTuned) {
            System.out.println("Piano is not tuned");
        } else {
            System.out.println("Playing the piano");
        }
    }

    public void pressKey(Key key) {
        if (!this.isTuned) {
            System.out.println("Piano is not tuned");
        } else if (key.isBroken()) {
            System.out.println("Key is broken");
        } else {
            key.press();
        }
    }

    public List<Key> getKeys() {
        return keys;
    }

    public boolean isTuned() {
        return isTuned;
    }
    @Override
    public String toString() {
        return "Piano{" +
                "keys=" + keys +
                ", isTuned=" + isTuned +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piano piano = (Piano) o;
        return isTuned == piano.isTuned &&
                Objects.equals(keys, piano.keys);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keys, isTuned);
    }
}