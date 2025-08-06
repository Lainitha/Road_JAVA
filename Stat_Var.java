public class Stat_Var {
    public static void main(String[] args) {

        Mobile myphone= new Mobile();
        myphone.brand="Apple";
        myphone.cost=1000;
        Mobile.type="SmartPhone";
        
        myphone.show();
        
        
        Mobile sivamPhone=new Mobile();
        sivamPhone.brand="Samsung";
        sivamPhone.cost=1200;

        sivamPhone.show();

        Mobile.stat_show(sivamPhone); // calling static method with object reference

        Mobile.stat_show2(); // calling static method without object reference: it can be called directly using class name, IT DOES NOT REQUIRE AN OBJECT
        
}}

class Mobile{

    String brand;
    int cost;
    static String type;

    static{
        type="Mobile-static smartphone"; // static block to initialize static variable
        System.out.println("Static block executed: type initialized to " ); 
    }

    public void show(){
        System.out.println(brand+ " : "+ cost+" :"+ type);
    }

    public static void stat_show(Mobile obj){      ////// static methods: have to be called with class name
        // static methods can access static variables directly
        // but to access non-static variables, we need to create an object of the class
        // and then access the non-static variables through that object

        System.out.println(obj.brand+ " : "+ obj.cost+" :"+ type);
    }

    public static void stat_show2(){
        System.out.println(type);
        // System.out.println(brand); // This will give an error because brand is non-static
    }
}
