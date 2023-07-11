

   public class Students
   {
	 int rollno;
	 int age;
	 
	 public void display1()
	 {
		System.out.println("welcome to all of you");
		
	 }
	   
	 public void dispaly2()
	 {
		System.out.println("Automation is very easy")
		 
	 }
	   
	 public static void main(String[] args)
	 {
		 Students obj=new Students(); 
		 
		 obj.age=10;
		 obj.rollno=103;
		 System.out.println(obj.age);
		 System.out.println(obj.rollno);
		 obj.display1();
		 System.out.println(obj.display1());
		 obj.dispaly2();
	 }  
	   
	   
	   
	   
   }