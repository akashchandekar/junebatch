package Package1;

public class Assignment1 {
	
	int rollno;
	 int age;
	 
	 public void display1()
	 {
		System.out.println("welcome to all of you");
		
	 }
	   
	 public void dispaly2()
	 {
		System.out.println("Automation is very easy");
		 
	 }
	   
	 public static void main(String[] args)
	 {
		 Assignment1 obj=new Assignment1(); 
		 
		 obj.age=10;
		 System.out.println(obj.age);
		 obj.rollno=103;
		 System.out.println(obj.rollno);
		 obj.display1();
//		 System.out.println(obj.display1());
		 obj.dispaly2();
	 }  

}
