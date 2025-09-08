/* java program to pass Command Line Arguments for input*/

class CommandLineDemo
{
public static void main(String[] args)
{
int number1,number2,sum;
String name;
name = args[0];
number1 = Integer.parseInt(args[1]);//typecsting - converting one datatype to another
number2 = Integer.parseInt(args[2]);

sum=number1+number2;

System.out.println(name +"  is a Java Programmer");
System.out.println("The Sum of 2 Number is:"+sum);
}
}