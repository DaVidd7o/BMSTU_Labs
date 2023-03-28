import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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