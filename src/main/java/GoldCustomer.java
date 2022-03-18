public class GoldCustomer extends Customer {
    String name;
    int oneprice;

    public GoldCustomer(String name,int oneprice){
        super(name,oneprice);


    }
    public void print(){
        System.out.println(name+"\t"+oneprice+"\t"+oneprice-(o));
    }

}
