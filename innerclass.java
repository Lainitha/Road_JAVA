public class innerclass {

    public static void main(String[] args) {
        
        Q q=new Q();
        q.simple();


        Q.Inner inner = q.new Inner(); // we need a pbject of outer class to create an object of inner class
        inner.InnerMethod();


        Q.StaticInner staticInner = new Q.StaticInner(); // we can create an object of static inner class without outer class object
        staticInner.StaticInnerMethod();

    
}
}


class Q{

    public void simple(){
        System.out.println(("Hello World, Not in Inner Class"));    
    }

    class Inner{
        public void InnerMethod(){
            System.out.println("Inner Method");
        }
    }

    static class StaticInner{
        public void StaticInnerMethod(){
            System.out.println("Static Inner Method");
        }
    }   
}