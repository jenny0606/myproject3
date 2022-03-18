public class Customer {
    String name;
    int  oneprice;

    float off=0.1f;

    public  Customer(String name){
        this.name=name;

    }
    public  Customer(String name,int oneprice){
        this(name);
        this.oneprice=oneprice;



    }
    public void print(){
    float offMoney=(oneprice/1000*off*1000);
        System.out.println(name+"\t"+oneprice+"\t"+(oneprice-offMoney));
    }



}
