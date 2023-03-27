abstract class Doctor {
    private String name;
    private int age;

    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println(toString() + "Я просто врач");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. " ;
    }
}