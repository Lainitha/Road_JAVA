public class Interface_w {

    public static void main(String[] args){

        Flowers R=new Rose();
        SunFlower S=new SunFlower();

        Bouquet bouquet = new Bouquet();
        bouquet.smelling(R);

    

    }
    
}
// abstract class Flowers{

//     public void hasLeaves(){

//     }

//     abstract public void smell();
// }

// class Rose extends Flowers{

//     public void smell(){
//         System.out.println("Rose is smelling good");
//     }
// }

// class SunFlower extends Flowers{

//     public void smell(){
//         System.out.println("Sunflower has no smell");
//     }
// }


// class Bouquet{

//     public void smelling(Flowers F){
//         F.smell();

//     }
// }

interface   Flowers{

    void smell();
}

class Rose implements  Flowers{

    public void smell(){
        System.out.println("Rose is smelling good");
    }
}

class SunFlower implements  Flowers{

    public void smell(){
        System.out.println("Sunflower has no smell");
    }
}


class Bouquet{

    public void smelling(Flowers F){
        F.smell();

    }
}
