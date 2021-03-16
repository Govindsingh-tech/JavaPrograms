package Polymorphism;

class Vehicle {
	String name = "Thar";
	int tyre = 8;
	public void Stop() {
		System.out.println("Sign to stop!");
	}
	public void Break() {
		System.out.println("Apply breaks!");
		}
}
class TwoWheeler extends Vehicle{
	int tyre = 2;
	void display() {
		System.out.println("Twowheeler bike!");
		System.out.println("No. of tyres: "+ tyre);
	}
}
class ThreeWheeler extends Vehicle{
	int tyre = 3;
	void display() {
		System.out.println("ThreeWheeler");
		System.out.println("No. of tyres: "+ tyre);
	}
	
}
class FourWheeler extends Vehicle {
	int tyre = 4;
	void display() {
		System.out.println("FourWheeler car");
		System.out.println("No. of tyres: "+ tyre);
	}
	}
	class Hello extends FourWheeler{
	void display(){
		System.out.println("Hello class!");
	}
}

public class InheritanceMain {

	public static void main(String[] args) {
		TwoWheeler t1 = new TwoWheeler();
        ThreeWheeler th1 = new ThreeWheeler();
        FourWheeler f1 = new FourWheeler();
        Hello h = new Hello();
       
        t1.display();
        th1.display();
        f1.display();
        h.display();
		
	}

}
