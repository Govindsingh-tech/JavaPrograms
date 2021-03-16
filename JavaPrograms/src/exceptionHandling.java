
public class exceptionHandling {

	public static void main(String[] args) {

		int num1, num2, num3;
		num1 = 20;
		num2 = 0;
		
		try {
			num3 = num1/num2;
			System.out.println("Result is: "+num1);
		}
		catch(ArithmeticException ae) {
			System.out.println("numbers cannot be divided by zero!");
		}
		catch(Exception b) {
			System.out.println("I am before the subclass exception");
		}
		finally {
			System.out.println("this block will always executed");
		}
		
		num3 = num1 + num2;
		System.out.println("result fter addition:" + num3);
	

	}

}
