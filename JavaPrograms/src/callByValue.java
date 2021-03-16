
public class callByValue {
	
	int data = 50;
	
	void change(callByValue obj) {
		obj.data = obj.data + 100; //changes will be in the instance variable
	}

	public static void main(String[] args) {
		
		callByValue obj = new callByValue();
		
		System.out.println("Before change: " + obj.data);
		obj.change(obj);
		System.out.println("After change: " + obj.data);
	}

}
