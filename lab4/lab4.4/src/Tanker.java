class Tanker extends Ship{

    public Tanker(String name, int width, int length, int SideHeight) {
        super(name, width,length,SideHeight);
    }
    // переопределение метода базового класса
    @Override
    public void work(){
        System.out.println(toString() + " Это танкер");
    }
}