
public class ThreadExample {

	public void run() {
			System.out.println("thread is running....");
		}
		public static void main(String[] args) {
			Thread t1 = new Thread();
			t1.start();
	}

}
