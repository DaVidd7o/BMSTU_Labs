abstract class Ship {
    private String name;

    private int width,length,SideHeight;

    public Ship(String name, int width, int length, int sideHeight) {
        this.name = name;
        this.width = width;
        this.length = length;
        SideHeight = sideHeight;
    }
    public void work() {
        System.out.println(toString() + "Это корабль");
    }

    @Override
    public String toString() {
        return "Этот корабль имеет название - " + name + ". Его Длина:" + length + " Ширина: " + width+ " Высота борта: " + SideHeight ;
    }
}