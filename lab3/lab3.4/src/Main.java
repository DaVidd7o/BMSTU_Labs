//Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль
// Phone: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Дебет, Кредит, Время городских и
// междугородных разговоров.
// Создать массив объектов.
// Вывести: a) сведения об абонентах, у которых время внутригородских разговоров превышает заданное;
//          b) сведения об абонентах, которые пользовались междугородной связью;
//          c) сведения об абонентах в алфавитном порядке.
import java.util.*;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Company_result test1 = new Company_result();
        test1.add(new Phone_Operator("Grigoryan","David","Rubenovich",
                "Erevan",7592837992323L,545.0,1743.0,456,0));
        test1.add(new Phone_Operator("Askerove","Nargiz","Alexandrovna",
                "Baku",7928734202441L,1200.0,1252.0,3446,1243));
        test1.add(new Phone_Operator("Zamula","Margo","Viktorovna",
                "Tbilisi",8792032423167L,2000.0,1942.0,168,654));
        test1.add(new Phone_Operator("Morozova","Nastya","Vladimirovna",
                "Kiev",1347290739242L,2412.0,1210.0,7952,2345));
        test1.add(new Phone_Operator("Panfilkin","Artyom","Makarovich",
                "Minsk",1980923453455L,2342.0,2334.0,1236,254));
        test1.add(new Phone_Operator("Ivanov","Vladimir","Igorevich",
                "Krasnodar",1989068304323L,6542.0,3534.0,6546,8765));

        System.out.println("Unsorted list of clients");
        test1.show();
        System.out.println("Sorted list of clients by Last Name:");
        test1.getSortByName();
        test1.show();


        System.out.println("Information about clients whose time of intra-city calls exceeds the specified(intercity time > 1000 ms)");
        ArrayList<Phone_Operator> listLocalLimit = new ArrayList<Phone_Operator>();
        listLocalLimit = test1.getClientsLocalLimitsTime(1000);
        for (Phone_Operator client : listLocalLimit){
            System.out.println(client);
        }

        System.out.println("Information about clients who used long-distance communication");
        ArrayList<Phone_Operator> listInter = new ArrayList<Phone_Operator>();
        listInter = test1.getClientsByInternationTime(0);
        for (Phone_Operator client : listInter){
            System.out.println(client);
        }
    }
}
class Company_result {
    private ArrayList<Phone_Operator> list_result = new ArrayList<>();
    void add(Phone_Operator phone) {
        list_result.add(phone);
    }
    void show() {
        for (Phone_Operator client : list_result){
            System.out.println(client);
        }
    }
    public ArrayList<Phone_Operator> getSortByName() {
        ArrayList<Phone_Operator> tempList = new ArrayList<Phone_Operator>();
        Comparator<Phone_Operator> countryModelsComparator
                = Comparator.comparing(Phone_Operator::getLast_name);

        Collections.sort(list_result, countryModelsComparator);
        return tempList;
    }
    public ArrayList<Phone_Operator> getClientsLocalLimitsTime(int time) {
        ArrayList<Phone_Operator> tempList = new ArrayList<Phone_Operator>();
        for (Phone_Operator client : list_result){
            if (client.getIntercity_time() > time){
                tempList.add(client);
            }
        }
        return tempList;
    }
    public ArrayList<Phone_Operator> getClientsByInternationTime(int inter_time) {
        ArrayList<Phone_Operator> tempList = new ArrayList<Phone_Operator>();
        for (Phone_Operator client : list_result){
            if (client.getIntercity_time() > inter_time){
                tempList.add(client);
            }
        }
        return tempList;
    }
}
class Phone_Operator {  // имя
    private static int all_clients=0;
    private int id = all_clients++;
    private String Last_name, First_name, Patron, Address; // ФИО и адрес
    private long credit_card;
    private double debet,credit,town_time,intercity_time;


    public Phone_Operator() {
    }

    public Phone_Operator(String last_name, String first_name, String patron, String address,
                          long credit_card, double debet, double credit, double town_time, double intercity_time) {
        Last_name = last_name;
        First_name = first_name;
        Patron = patron;
        Address = address;
        this.credit_card = credit_card;
        this.debet = debet;
        this.credit = credit;
        this.town_time = town_time;
        this.intercity_time = intercity_time;
    }

    public String getFirst_name() {
        return First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public String getPatron() {
        return Patron;
    }

    public String getAddress() {
        return Address;
    }

    public double getId() {
        return id;
    }

    public double getDebet() {
        return debet;
    }

    public double getCredit() {
        return credit;
    }

    public double getTown_time() {
        return town_time;
    }

    public double getIntercity_time() {
        return intercity_time;
    }

    public long getCredit_card() {
        return credit_card;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        First_name = first_name;
    }

    public void setPatron(String patron) {
        Patron = patron;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDebet(double debet) {
        this.debet = debet;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public void setTown_time(double town_time) {
        this.town_time = town_time;
    }

    public void setIntercity_time(double intercity_time) {
        this.intercity_time = intercity_time;
    }

    public void setCredit_card(long credit_card) {
        this.credit_card = credit_card;
    }

    @Override
    public String toString() {
        return "Phone_Operator{" +
                "all_clients=" + all_clients +
                ", id=" + id +
                ", Last_name='" + Last_name + '\'' +
                ", First_name='" + First_name + '\'' +
                ", Patron='" + Patron + '\'' +
                ", Address='" + Address + '\'' +
                ", credit_card=" + credit_card +
                ", debet=" + debet +
                ", credit=" + credit +
                ", town_time=" + town_time +
                ", intercity_time=" + intercity_time +
                '}';
    }
}