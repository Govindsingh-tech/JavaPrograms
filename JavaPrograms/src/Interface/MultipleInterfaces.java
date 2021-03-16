package Interface;

interface FirstInterface{
	public void myMethod();
}

interface secondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, secondInterface {
	public void myMethod() {
		System.out.println("Some text....");
	}
	public void myOtherMethod() {
		System.out.println("Some other text.....");
	}
}

public class MultipleInterfaces {

	public static void main(String[] args) {
		
		
		DemoClass d = new DemoClass();
		d.myMethod();
		d.myOtherMethod();
	}

}
