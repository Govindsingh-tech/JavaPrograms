
public class Methods {
	
	int rollno;  
    String name;  
    static String college = "ITS";  
    
    //static method to change the value of static variable  
    static void change(){  
	    college = "BBDIT"; 
	    System.out.println("in change method");
    }  
    
    //constructor to initialize the variable  
    Methods(int r, String n){  
	    rollno = r;  
	    name = n;  
	    System.out.println("i am inside the constructor");
    }  
       
    static{
    	System.out.println("i am inside the static block");
    }
    
    //method to display values  
    void display()
    {
    	System.out.println(rollno+" "+name+" "+college);
    }  
 

//Test class to create and display the values of object    
   public static void main(String args[]){  
   
   //creating objects  
	   Methods s1 = new Methods(111,"Karan");  
	   Methods s2 = new Methods(222,"Aryan");  
	   Methods s3 = new Methods(333,"Sonoo");  
    
   //calling display method  
   s1.display();  
   s2.display();  
   s3.display();  
   
   s1.change();
   
   //again calling display method  
   s1.display();  
   s2.display();  
   s3.display();
	}
}
