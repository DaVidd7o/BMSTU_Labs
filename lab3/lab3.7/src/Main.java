import java.util.ArrayList;

//Система Телефонная станция.
// Абонент оплачивает Счет за разговоры и Услуги, может попросить Администратора сменить
// номер и отказаться от услуг.
// Администратор изменяет номер, Услуги и временно отключает Абонента за неуплату.
public class Main {
    public static void main(String[] args) {
        Admin ADMIN = new Admin();
        ArrayList<Service> ServicesForClient1 = new ArrayList<Service>();
        ServicesForClient1.add(new Service("Inet", 500));
        ServicesForClient1.add(new Service("TV", 350));
        ServicesForClient1.add(new Service("Phone", 170));
        //Customer Tom = new Customer("Grigoryan","David",567482,
          //      919964,567,true,0);
        Customer Glenn = new Customer();
        Glenn.Add(new Customer("Grigoryan","David",567482,
                      919964,567,true,0));
        Tom.AddServices(ServicesForClient1);


        ArrayList<Service> ServicesForClient2 = new ArrayList<Service>();
        ServicesForClient2.add(new Service("Inet", 500));
        ServicesForClient2.add(new Service("Phone", 170));
        //ArrayList<Customer> List2 = new ArrayList<Customer>();
        Customer Andy = new Customer("Grigoryan","David",100,
                919964,567,true,0);
        Andy.AddServices(ServicesForClient2);
        Andy.GetAdmin(ADMIN,ServicesForClient2);
        Andy.PayTheBill();
        System.out.println(Andy.on);
    }
}