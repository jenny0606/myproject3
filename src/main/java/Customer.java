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
    public  float backMoney(){
        return (oneprice/1000*off*1000);
    }
    public void print(){

        System.out.println(name+"\t"+oneprice+"\t"+(oneprice-backMoney())+"("+backMoney()+")");
    }



}
