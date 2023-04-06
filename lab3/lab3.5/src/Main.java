//Создать приложение, удовлетворяющее требованиям, приведенным в задании. Аргументировать принадлежность
//        классу каждого создаваемого метода и корректно переопределить для каждого класса
//        методы equals(), hashCode(), toString().
// 7. Создать объект класса Дерево, используя классы Лист.
//        Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Leaf> leaves = new ArrayList<>();
        Leaf leaf1 = new Leaf("green", "round");
        Leaf leaf2 = new Leaf("green", "oval");
        Leaf leaf3 = new Leaf("green", "round");
        leaves.add(leaf1);
        leaves.add(leaf2);
        leaves.add(leaf3);
        Tree tree = new Tree(leaves);

        System.out.println(leaf1.equals(leaf2));
        System.out.println(leaf1.equals(leaf3));
        System.out.println(leaf1.hashCode());
        System.out.println(leaf3.hashCode());
        System.out.println(leaf2.hashCode());
        System.out.println(tree.equals(leaf1));
        System.out.println(tree.equals(tree));
        System.out.println(leaf1.hashCode());

        System.out.println(tree.toString());
        tree.bloom();
        System.out.println(tree.toString());
        tree.frost();
        System.out.println(tree.toString());
        tree.yellowLeaves();
        System.out.println(tree.toString());
        tree.fallLeaves();
        System.out.println(tree.toString());
    }
}