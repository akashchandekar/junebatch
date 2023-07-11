package Package1;
// {} means boundray of the class
// we will keep(put) variable + Method
// Variable---- which store some value and value can be changed
// Method-----for performing any operation we will create method for it

public class Students 
{
    int a; //  variable 
    
    public void akash()  // method
    {    
//    	System.out.println("The value of a is:" +a);
    	System.out.println("Welcome I am Akash!!");
    }
    
    public void anu()  // method
    {    
//    	System.out.println("The value of a is:" +a);
    	System.out.println("Welcome I am ANu!!");
    }
    
    public void tanu()  // method
    {    
//    	System.out.println("The value of a is:" +a);
    	System.out.println("Welcome I am Tanu!!");
    }
    
//  main method  
    public static void main(String[] args) {
		 Students obj=new Students(); // object creation
		 obj.tanu();
		 obj.akash();
		 obj.anu();
		 obj.a=1;
		 obj.a=100;
//		 System.out.println(obj.a);
		 obj.a=200;
		 System.out.println(obj.a);
	}
    
}
