class outerClass {
	int x = 10;
	
	static class innrClass{
		int y = 5;
		int z =45;
	}
}
public class innerClasss { 

	public static void main(String[] args) {
		
		
		outerClass.innrClass myInr =new outerClass.innrClass();
		System.out.println(myInr.y + myInr.z);

	}

}
