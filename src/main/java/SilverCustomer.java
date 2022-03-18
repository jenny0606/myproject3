public class SilverCustomer extends Customer {
    String name;
    int oneprice;

    public SilverCustomer(String name, int oneprice){
        super(name,oneprice);


    }



    public void print(){

        System.out.println(name+"\t"+oneprice+"\t"+(oneprice-backMoney())+"("+backMoney()+")");
    }

}
