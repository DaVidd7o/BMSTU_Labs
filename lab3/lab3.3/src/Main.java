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
public class Main {
    public static void main(String[] args) {
        Company_result test1 = new Company_result();
        test1.add(new Phone_Operator("Grigoryan","David","Rubenovich",
                "Erevan",7592837992323L,545.0,1743.0,456,0));
        test1.add(new Phone_Operator("Askerova","Nargiz","Alexandrovna",
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