import java.util.*;
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
class Key {
    private int number;
    private boolean isPressed;
    private boolean isBroken;

    public Key(int number, boolean isPressed, boolean isBroken) {
        this.number = number;
        this.isPressed = isPressed;
        this.isBroken = isBroken;
    }

    public void press() {
        this.isPressed = true;
        System.out.println("Key #" + this.number + " is pressed");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
    @Override
    public String toString() {
        return "Key{" +
                "number=" + number +
                ", isPressed=" + isPressed +
                ", isBroken=" + isBroken +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return number == key.number &&
                isPressed == key.isPressed &&
                isBroken == key.isBroken;
    }
    @Override
    public int hashCode() {
        return Objects.hash(number, isPressed, isBroken);
    }
}
public class Main {
    public static void main(String[] args) {
        List<Key> keys = new ArrayList<>();
        Key key1 = new Key(1, false, false);
        Key key2 = new Key(2, false, true);
        keys.add(key1);
        keys.add(key2);
        Piano piano = new Piano(keys);
        System.out.println(piano.toString());
        piano.tune();
        System.out.println(piano.toString());
        piano.play();
        piano.pressKey(key1);
        piano.pressKey(key2);
    }
}