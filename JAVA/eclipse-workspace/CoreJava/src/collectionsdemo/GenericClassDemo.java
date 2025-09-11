package collectionsdemo;

public class GenericClassDemo {

	public static void main(String[] args) {
		Sample<String> s1 = new Sample<String>("java Generics");//object of generic class for Type String
		System.out.println("Display from Generic class by  passing String object : "+s1.getData());
		
		Sample<Integer> s2 = new Sample<Integer>(200);//object of generic class for Type Integer
		System.out.println("Display from Generic class by  passing Integer object : "+s2.getData());
		
		Sample<Double> s3 = new Sample<Double>(550.55);//object of generic class for Type Double
		System.out.println("Display from Generic class by  passing Double object : "+s3.getData());
		

	}

}
