import java.io.IOException;

public class throwExample {
	
	void m() throws IOException{
		throw new IOException("Device Error");
	}
	
	void n() throws IOException{
		m();
	}
	
	void p() {
		try {
			n();
		}catch (Exception e) {
			System.out.println("exception handling");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
		}
	}
	public static void main(String[] args) {
		
		throwExample obj = new throwExample();
		obj.p();
		System.out.println("normal flow....");
		
		}
	}

