public class Methods {

    public static void main(String[] args) {

        Computer ex =new Computer ();

        ex.emptyMethod();
        String results = ex.buyPen(9);
        System.out.println(results);


        System.out.println("Method OverLoading.......");


        Calculator qw = new Calculator();
        double results1=qw.add(10.2,30);
        System.out.println(results1);

        int result2 = qw.add(78,9);
        System.out.println(result2);
        




        
    }
    
}


class Computer{
    public void emptyMethod(){
        System.out.println("here in void methods, we are not returning anything");

    }

    public String buyPen(int cost){
        if (cost>=10){
            return "Pen";

        }

        return "if returned anything, method will get break ";

    }
}


class Calculator {

    // Method 1: Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two doubles with over loading
    public double add(double a, double b) {
        return a + b;
    }

    // Method 4: Add int and double (order matters)
    public double add(int a, double b) {
        return a + b;
    }

    // Method 5: Add double and int (different parameter order)
    public double add(double a, int b) {
        return a + b;
    }
    
    // Invalid overloading: only changing return type (will cause error)
    // public double add(int a, int b) { ... }  <-- Error!
}
