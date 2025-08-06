public class Inheritance {
    public static void main(String[] args) {

        Calcu obj = new Calcu();
        int r1=obj.add(3,4);
        int r2=obj.sub(7,9);

        System.out.println(r1 +" "+r2);

        AdvanCal obj2 = new AdvanCal();
        int r3= obj2.add(78,67);
        int r4 =obj2.mul(3,5);

        VeryAdvCal obj3 = new VeryAdvCal();
        System.out.println(obj3.sub(7,9)+" overriding sub method");



        System.out.println(r3+ " "+ r4);

        
    }

    
}

class Calcu{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1, int n2){
        return n1-n2;
    }

}

class AdvanCal extends Calcu{

    public int mul(int n1, int  n2){
        return n1*n2;
    }

}

class VeryAdvCal extends  AdvanCal {
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    
    }

    public int sub(int n1, int n2) {
        return n2 -n1; // over ridding the sub method from Calcu class, different behavior
    }
}

