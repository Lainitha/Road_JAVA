public class Abstract_c {

    public static void main (String[] args){

        Car car1 = new WagonR(); //CAONT CREATE A OBJECT Of abstarct class
        car1.drive();
        car1.playMusic();


        Car car2= new SwiftDzire();
        car2.drive();
        car2.fly();
    }
    
}


abstract class Car{
    public abstract void drive(); //declaration
    
    public abstract void fly(); //declaration

    

    public void playMusic(){
        System.out.println("Play Music");
    }
}

class WagonR extends Car{

    public void drive(){
        System.out.println("WagonR is Driving");


    }

    public void fly(){
        System.out.println("WagonR is Flying");
    }
}

abstract class Swift extends Car{   // since we are not implementing all abstract class, we make it as abstarct 

    public void drive(){
        System.out.println("Swift is Driving");
    }

    
} // THE PROBLEM IS WE CANT DECLARE AN OBJECT OF AN ABSTRACT CLASS
// SO WE CANT CREATE AN OBJECT OF SWIFT CLASS


class SwiftDzire extends Swift{  //concrete class, since we are implementing all abstract methods.

    public void fly(){
        System.out.println("SwiftDzire is Flying");
    }
}
