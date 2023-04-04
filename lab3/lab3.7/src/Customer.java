import java.util.ArrayList;
import java.util.Random;

public class Customer {
    String FName,LName;
    int account, number, phoneConversations;
    boolean on;
    int time;
    int TheFinalPrice;


    public Customer(String FName, String LName, int account, int number, int phoneConversations, boolean on, int time) {
        this.FName = FName;
        this.LName = LName;
        this.account = account;
        this.number = number;
        this.phoneConversations = phoneConversations;
        this.on = on;
        this.time = time;
    }

    public Customer() {
    }

    public void AddServices(ArrayList<Service> list) {
        ArrayList<Service> ServicesCust = new ArrayList<Service>();
        ServicesCust = list;
        for (Service serv : list){
            TheFinalPrice = TheFinalPrice + serv.price;
        }

    }

    public void PayTheBill() {
        if (this.account > TheFinalPrice) {
            this.account = this.account-TheFinalPrice;
            System.out.printf("Счет оплачен, уважаемый ",this.FName);
            System.out.println("Текущий счет:");
            System.out.println(this.account);
        }
        else {
            System.out.printf("Не хватет средств",this.FName);
            Admin AD = new Admin();
            AD.NonPayment(this.number);


        }
    }

    public void GetAdmin(Admin name,ArrayList<Service> list) {
        this.number = name.ChangeNumber(this.number);
        name.RefuseSevices(list);
    }

}
