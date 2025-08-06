class Ab
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class Bc extends Ab
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class Cd extends Ab
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}


public class DyMeDis {
	public static void main(String[] args) {
//		A obj=new B(); /// can be done
//		obj.show();
		
		Ab obj=new Ab();
		obj.show();
		
		obj=new Bc();
		obj.show();
		
		obj=new Cd();
		obj.show();
		
//		obj=new D();
		
//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();
	
	}
}