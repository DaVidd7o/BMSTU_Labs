class NeuroSurgeon extends Doctor{

    public NeuroSurgeon(String name, int age) {
        super(name, age);
    }
    // переопределение метода базового класса
    @Override
    public void work(){
        System.out.println(toString() + "Я работаю нейрохирургом");
    }
}