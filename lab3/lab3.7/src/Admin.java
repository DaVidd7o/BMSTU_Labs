import java.util.ArrayList;
import java.util.Random;

public class Admin {

    public int ChangeNumber(int num){
        Random rand = new Random();
        int newnumber = (int) (Math.random()*900000)+100000;
        return newnumber;
    }
    public void RefuseSevices(ArrayList<Service> list){
        list.clear();
    }
    public void NonPayment(int a,ArrayList<Customer> list1){
        for (Customer client : list1){
            if (client.account == a){
                client.on = false;
                client.time = 1440;
            }
        }
    }
}
