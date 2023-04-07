import java.util.concurrent.Semaphore;

class WithdrawalThread implements Runnable{

    Account account;
    Semaphore sem;
    String name;
    int price;
    WithdrawalThread(Account acc, Semaphore sem, String name,int price){
        this.account=acc;
        this.sem=sem;
        this.name=name;
        this.price=price;
    }

    public void run(){
        try{
            System.out.println(name + " is running. Please wait...");
            sem.acquire();
            if (account.x-price<0) {
                System.out.println("Insufficient funds! ");
            }
            else {
                account.x -= price;
            }
            System.out.println("Current account after Withdrawal: "+account.x);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        sem.release();
    }
}