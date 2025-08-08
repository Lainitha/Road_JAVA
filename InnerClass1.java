public class InnerClass1 {

    public static void main(String[] args) {

        Az az = new Az(){
            public void show() {
                System.out.println("Hello, in Annonymous class show");
            }
        };
        
        az.show();

        Ay b = new Ay() {
            public void show() {
                System.out.println("Hello, in B show abstract annonymous class  show");
            }
        };
        b.show();





    }

    
}


abstract class Ay{

    public abstract void show();
}

class Az{

    public void show(){
        System.out.println("Hello, in AZ show");        
    }
}

// class Bz extends Az{

//     public void show(){

//         System.out.println("Hello, in BZ show");
//     }

    
// }

