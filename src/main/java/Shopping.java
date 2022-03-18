import java.util.concurrent.Callable;

public class Shopping {
    public static void main(String[] args) {

        Customer ordinary=new Customer("0001",1200);
        Customer silver=new Customer("0002",800);
        Customer  gold=new Customer("0003",2000);
        ordinary.print();
        silver.print();
        gold.print();


    }
}
