
public class multipleCatchBlock {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = (30/0);
			a[6] = 9;
		}
		catch (ArithmeticException e) {
			System.out.println("arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch ()

	}

}
