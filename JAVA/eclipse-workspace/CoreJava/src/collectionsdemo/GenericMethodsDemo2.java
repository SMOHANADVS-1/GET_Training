package collectionsdemo;

public class GenericMethodsDemo2 {
	//Syntax: <type-parameter> return_type method_name (parameters) {...}

	<T> void show(T a)
	{
		System.out.println("The Generic value is: "+a);
	}
	<V,T> void hello(V a,T b)
	{
		System.out.println(a.getClass().getName()+" = "+a+" ");
		System.out.println(b.getClass().getName()+" = "+b+" ");
	}
	

	public static void main(String[] args) {
				GenericMethodsDemo2 gd=new GenericMethodsDemo2();
				
				gd.show(100);
				gd.show(1000.50);
				gd.show("Generics in Java");
				gd.show('A');
				gd.show(true);
				gd.show(10.0f);
				gd.show(10L);
				
				System.out.println();
				
				gd.hello(101, "James Gosling");
				gd.hello("Rod Jhonson","Spring");
				gd.hello("Java", 8);
				gd.hello(120, 200.50);

	}

}
