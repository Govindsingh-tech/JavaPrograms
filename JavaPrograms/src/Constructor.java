//parameterized Constructor and Constructor overloading Example
public class Constructor {
	
	int id;
	String name;
	int age;
	
	//creating two arg constructor
	Constructor(int i, String n){
		id = i;
		name = n;	
	}
	
	//creating three arg constructor
	Constructor(int i, String n, int a){
		id = a;
		name = n;
		age = a;
	}
	
	//method to display the value of id and name 
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	
	public static void main(String[] args) {
		
		//creating objects and passing values
		Constructor obj1 = new Constructor(111, "karan");
		Constructor obj2 = new Constructor(222, "aryan", 25);
		
		//Calling method to display the values of object
		obj1.display();
		obj2.display();
		

	}

}
