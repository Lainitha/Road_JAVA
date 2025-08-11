class A extends Thread{
    int i;
    public void run(){
        for (i=0; i<100; i++){
            System.out.println("Hi");
    
        }
    }
    
}

class B extends Thread{
    int i;
    public void run(){
        for (i=0; i<100; i++){
            System.out.println("Hello");
        }
    }
}

public class MThreads {
    public static void main(String[] args){
        A obj1 =new A();
        B obj2=new B();

        obj1.start();
        obj2.start();
    }
}