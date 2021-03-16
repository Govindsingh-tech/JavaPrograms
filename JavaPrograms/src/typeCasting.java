
public class typeCasting {

	public static void main(String[] args) {
		
		//Implicit TypeCasting
		int x = 7;
		long y = x;
		float z = y;
		double d = z;
		
		System.out.println("Before conversion: " + x);
		System.out.println("After conversion: " + y);
		System.out.println("After conversion: " + z);
		System.out.println("After conversion: " + d);
		
		System.out.println("============================");
		
		//Explicit Typecasting
		double a = 435.54;
		float f = (float) a;
		long l = (long) f;
		int i = (int) l;
		
		System.out.println("Before conversion: " + a);
		System.out.println("After conversion: " + f);
		System.out.println("After conversion: " + l);
		System.out.println("After conversion: " + i);
		

	}

}
