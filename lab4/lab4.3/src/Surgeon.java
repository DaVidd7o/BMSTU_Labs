class SurgenDoctor extends Doctor {
    public SurgenDoctor(String name, int age) {
        super(name, age);
    }
    // переопределение метода базового класса
    @Override
    public void work() {
        System.out.println( toString() + "Я работаю хирургом");
    }
}