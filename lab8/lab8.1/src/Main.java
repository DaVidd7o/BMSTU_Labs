import java.util.concurrent.Semaphore;
//	Реализовать многопоточное приложение “Банк”. Имеется банковский счет.
//        Сделать синхронным пополнение и снятие денежных средств на счет/со счет случайной суммой.
//        При каждой операции (пополнения или снятие) вывести текущий баланс счета.
//        В том случае, если денежных средств недостаточно – вывести сообщение.
public class Main {

    public static void main(String[] args) {
        var account = new Account();
        Semaphore sem = new Semaphore(1); // 1 разрешение
        new Thread(new AdditionThread(account, sem, "Пополнение",150)).start();
        new Thread(new WithdrawalThread(account, sem, "Снятие",200)).start();
    }
}
class Account{
    int x=0;
}