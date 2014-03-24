/* Functions.java */

public class Functions {

	native int sum(int number1,int number2);
	native int subtraction(int number1,int number2);
	native int division(int number1,int number2);
	native int multiplication(int number1,int number2);
	native int pow(int number1,int number2);
	
	static 
	{
		System.loadLibrary("Functions");
	}
	
	public static void main(String[] args)
	{
		Functions functions = new Functions();
		System.out.println(functions.sum(4,3));
		System.out.println(functions.pow(2,3));
		System.out.println(functions.multiplication(40,3));
	}

}
