import java.util.ArrayList;

//Система Телефонная станция.
// Абонент оплачивает Счет за разговоры и Услуги, может попросить Администратора сменить
// номер и отказаться от услуг.
// Администратор изменяет номер, Услуги и временно отключает Абонента за неуплату.
public class Main {
    public static void main(String[] args) {
        Admin ADMIN = new Admin();
        ArrayList<Customer> List2 = new ArrayList<Customer>();
        ArrayList<Service> ServicesForClient1 = new ArrayList<Service>();
        ServicesForClient1.add(new Service("Inet", 500));
        ServicesForClient1.add(new Service("TV", 350));
        ServicesForClient1.add(new Service("Phone", 170));
        Customer Tom = new Customer("Grigoryan","David",567482,
                919964,567,true,0);
        Tom.AddServices(ServicesForClient1);
        List2.add(Tom);


        ArrayList<Service> ServicesForClient2 = new ArrayList<Service>();
        ServicesForClient2.add(new Service("Inet", 500));
        ServicesForClient2.add(new Service("Phone", 170));
        Customer Andy = new Customer("Ivanov","Alex",100,
                991264,127,true,0);
        Andy.AddServices(ServicesForClient2);
        List2.add(Andy);
        Andy.GetAdmin(ADMIN,ServicesForClient2);

        ADMIN.getallclients(List2);
        Andy.PayTheBill();
        System.out.println(Andy.on);
    }
}