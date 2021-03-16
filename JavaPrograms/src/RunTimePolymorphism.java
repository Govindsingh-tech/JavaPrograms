
//example of dynamic Polymorphism
class Bank{
	float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	float getRateOfInterest() {
		return 8.4f;
	}
}

class ICICI extends Bank{
	float getRateOfInterest() {
		return 7.5f;
	}
}

class AXIS extends Bank{
	float getRateOfInterest() {
		return 9.6f;
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		Bank b;
		
		b = new SBI();
		System.out.println("SBI rate os Interest is: "+b.getRateOfInterest());
		b = new ICICI();
		System.out.println("ICICI rate os Interest is: "+b.getRateOfInterest());
		b = new AXIS();
		System.out.println("AXIS rate os Interest is: "+b.getRateOfInterest());
		
		

	}

}
