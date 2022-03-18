import java.util.concurrent.Callable;

public class Shopping {
    public static void main(String[] args) {

        Customer ordinary=new Customer("0001",1200);
        Customer silver=new Customer("0002",800);
        SilverCustomer gold=new SilverCustomer("0003",2000);
        GoldenCustomer agold=new GoldenCustomer("0004",5000);
        ordinary.print();
        silver.print();
        gold.print();
        agold.print();

    }
}
