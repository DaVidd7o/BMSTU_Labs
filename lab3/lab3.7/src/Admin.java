import java.util.ArrayList;
import java.util.Random;

public class Admin {
    private static ArrayList<Customer> list_result = new ArrayList<>();
    public int ChangeNumber(int num){
        Random rand = new Random();
        int newnumber = (int) (Math.random()*900000)+100000;
        return newnumber;
    }
    public void RefuseSevices(ArrayList<Service> list){
        list.clear();
    }
    public void NonPayment(int a){
        for (Customer client : list_result){
            if (client.account == a){
                client.on = false;
                client.time = 1440;
            }
        }
    }
    public void getallclients(ArrayList<Customer> list5){
        list_result = list5;
    }
}
