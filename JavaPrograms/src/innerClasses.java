
public class innerClasses {
	
	private static void  outerMethod() {
		System.out.println("Inside the outerMethod");
	}
	
	//A Static Inner Class
	static class inner {

	public static void main(String[] args) {
		System.out.println("inside inner class method!");
		outerMethod();

	}

}}
