public class Strings {
	public static void main(String[] args) 
	{
		String name=new String();
		System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("hello "+name);
		System.out.println(name.concat("reddy"));
//      String name="Navin";


		String name2="navin";
		name2=name2+"reddy";
		System.out.println("hello "+name2);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
		
		
	}
}