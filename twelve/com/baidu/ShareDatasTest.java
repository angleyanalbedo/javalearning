package twelve.com.baidu;

public class ShareDatasTest {
    public static void main(String[] args) {
//        TicketImp th = new TicketImp(100);
//        Thread th1 = new Thread(th,"窗口一");
//        Thread th2 = new Thread(th,"窗口二");
//        Thread th4 = new Thread(th,"窗口三");
        Thread th1= new TicketThread(100);
        Thread th2 = new TicketThread(90);
        Thread th4 = new TicketThread(100);
        th1.start();
        th2.start();
        th4.start();
    }
}
