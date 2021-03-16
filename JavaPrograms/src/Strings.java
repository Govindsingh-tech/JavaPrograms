
public class Strings {

	public static void main(String[] args) {
		//methods of strings
				System.out.println("Methods of Strings");
				
				String sl=new String("Hello World");
				System.out.println(sl.length());

				//substring
				String sub = new String("Welcome");
				System.out.println(sub.substring(2));
				
				//comparison
				String s1 = "Hello";
				String s2 = "Hello";
				System.out.println(s1.compareTo(s2));
				
				//IsEmpty
				String s4 = "";
				System.out.println(s4.isEmpty());
				
				//toLowerCase
				String s5 = "WELCOME";
				System.out.println(s5.toLowerCase());
				System.out.println(s5.toUpperCase());
				
				//replace
				String s6 = "Heldo";
				System.out.println(s6.replace('d', 'l'));
				
				//equals
				String x = "Welcome to Java";
				String y = "Welcome tO JAvA";
				System.out.println(x.equals(y));
				System.out.println("\n");
				System.out.println("Creating String Buffer");
				
				//String Buffer and append method
				StringBuffer s = new StringBuffer("Welcome to Java!");
				s.append("Enjoy your learning.");
				System.out.println(s);
				
				//insert method
				s.insert(0, 'w');
				System.out.println(s);
				
				//replace method
				StringBuffer sb = new StringBuffer("Hello");
				sb.replace(0, 2, "hel");
				System.out.println(sb);
				
				//delete method
				sb.delete(0, 1);
				System.out.println(sb);
				
				//String Builder
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1 = new StringBuilder("Happy ");
				sb1.append("Learning!");
				System.out.println(sb1);
				System.out.println(sb1.delete(0,1));
				System.out.println(sb1.insert(0, "Welcome "));
				System.out.println(sb1.reverse());
				
				//conversion
				System.out.println("\n");
				System.out.println("Conversion of strings to stringbuffer and stringbuilder:");
				String str = "Hello";
				
				//conversion from string object to stringbuffer
				StringBuffer sbr = new StringBuffer(str);
				sbr.reverse();
				System.out.println("String to StringBuffer");
				System.out.println(sbr);
				
				//conversion from string object to StringBuilder
				StringBuilder str1 = new StringBuilder(str);
				str1.append(" World");
				System.out.println("String to StringBuilder");
				System.out.println(str1);
				
	}

}
