import java.util.Objects;

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