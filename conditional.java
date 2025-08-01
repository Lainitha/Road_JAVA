class conditional {

    public static void main (String[] args){

        int a=20;
        int b=30;
        int c=40;

        if (a>b || a>c)
        
            System.out.println("a is greater");

        System.out.println("a is samller");

        if (b>a && b>c)
            System.out.println("b is greatest");
        
        else if (a>b && a>c)
            System.out.println("a is greatest");
        
        else if (c>a && c>b){
            System.out.println("c is greatest");
            System.out.println("we have to put curley bracket if we are writing more than one line");
        }

    }
    
}
