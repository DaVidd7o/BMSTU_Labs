import java.util.concurrent.Semaphore;

class AdditionThread implements Runnable{

    Account account;
    int price;
    Semaphore sem;
    String name;
    AdditionThread(Account acc, Semaphore sem, String name,int price){
        this.account=acc;
        this.sem=sem;
        this.name=name;
        this.price=price;
    }

    public void run(){
        try{
            System.out.println(name + " is running. Please wait...");
            sem.acquire();
            account.x += price;
            System.out.println("Current account after Addition: "+account.x);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        sem.release();
    }
}