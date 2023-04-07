import java.util.concurrent.Semaphore;

public class RightFootStep implements Runnable{
    String move;
    Semaphore sem;
    RightFootStep(String Move,Semaphore sem){
        this.move=Move;
        this.sem=sem;
    }

    public void run(){
        try{
            sem.acquire();
            System.out.println(move);
            Thread.sleep(1000);
        }
        catch(InterruptedException e){System.out.println(e.getMessage());}
        sem.release();
    }
}