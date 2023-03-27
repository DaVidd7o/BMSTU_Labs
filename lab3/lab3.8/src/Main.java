import java.util.ArrayList;

//Система Автобаза. Диспетчер распределяет заявки на Рейсы между Водителями и назначает для этого Автомобиль.
// Водитель может сделать заявку на ремонт.
// Диспетчер может отстранить Водителя от работы. Водитель делает отметку о выполнении Рейса и состоянии Автомобиля
public class Main {
    public static void main(String[] args) {
        ArrayList<Auto> allAuto = new ArrayList<Auto>();
        ArrayList<Driver> allDrivers = new ArrayList<Driver>();
        ArrayList<Trip> alltrips = new ArrayList<Trip>();
        Operator Dispatch = new Operator();

        Auto Ford = new Auto("Ford",true,true,false,100,123456);
        Auto Toyota = new Auto("Toyota",true,true,false,40,123412);
        Auto Mini = new Auto("Mini",false,false,false,10,765847);
        Auto BMW = new Auto("BMW",false,true,false,0,456792);
        Auto Lada = new Auto("Lada",true,true,false,180,827346);
        allAuto.add(Ford);
        allAuto.add(Toyota);
        allAuto.add(Mini);
        allAuto.add(BMW);
        allAuto.add(Lada);

        Driver alex = new Driver("Alex","Grigoryan",34,456792,true,true);
        allDrivers.add(new Driver("Alex","Grigoryan",34,456792,true,true));
        allDrivers.add(new Driver("Eren","Rayan",24,0,false,true));
        allDrivers.add(new Driver("David","Mosin",43,0,true,true));
        allDrivers.add(new Driver("Slava","Lobok",50,0,true, true));

        alltrips.add(new Trip("Moscow","Ramenskoe","",100,0,false));
        alltrips.add(new Trip("Minsk","Kaliningrad","",480,0,false));
        alltrips.add(new Trip("Erevan","Zelenograd","",100,0,false));
        alltrips.add(new Trip("Vilnus","Warsava","",780,0,false));
        //Dispatch.SuspendDriver("Mosin",allDrivers);
        for (Driver uber : allDrivers){
            System.out.printf("%s: ",uber.FirstName);
            System.out.println(uber.active);
        }
        Dispatch.DistributeRequests(allDrivers,allAuto,alltrips);
        alex.TicketForRepair(456792,allAuto);
        alex.ReportOfAuto(BMW);



    }
}