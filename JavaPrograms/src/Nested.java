
public class Nested {

	public static void main(String[] args) {
		try {
			checkException();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}finally {
			System.out.println("finally outside method");
		}

	}
	public static void checkException() {
		try {
			int res = 3/0;
		}finally {
			System.out.println("Finaaly inside method");
		}
	}

}
