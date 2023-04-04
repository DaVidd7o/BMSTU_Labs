import java.util.*;
//Создать объект класса Пианино, используя класс Клавиша. Методы: настроить, играть на пианино, нажимать клавишу.
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