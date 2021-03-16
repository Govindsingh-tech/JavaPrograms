
public class CustomException {
	
	static void validate (int age) throws InvalidAgeException{
		if(age<18) 
			throw new InvalidAgeException ("not valid");
			else
				System.out.println("Welcome to vote:");
		}

	public static void main(String[] args) {
		try {
			validate(17);
		}catch (Exception m) {
			System.out.println("Exception occured: "+m);
		}
		System.out.println("rest of the code...");
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String string) {
		// TODO Auto-generated constructor stub
	}

	InvalidAgeException s = new InvalidAgeException(null);
	super(s);
}}
