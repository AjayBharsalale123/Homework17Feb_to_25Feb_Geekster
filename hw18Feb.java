package hw_oop;

//class Student{
//	String name;
//	int roll_no;
//
//
//void insert(String n,int r) {
//	name=n;
//	roll_no=r;
//}
//void display() {
//	System.out.println(name+" "+roll_no);
//}
//}

//   class Student1{
//	   
//	   int roll_no;
//	   long mobNo;
//	   String Address;
//	   
//	  public void insert(int r,long m,String a) {
//		   roll_no=r;
//		   mobNo=m;
//		   Address=a;
//	   }
//	   
//	  public void display() {
//		   System.out.println(roll_no+" "+mobNo+" "+Address);
//	   }
//   }


		
		class Employee{
			String eName;
			int eId;
			
			Employee(String n,int r) {
				eName=n;
				eId=r;
			}
			
			public void display() {
				System.out.print(eName+" "+eId+" ");
				
			}
		}
		
		
public class hw18Feb {
	
	public static void main(String[] args) {
		
//		Student s1=new Student();
		
//		s1.insert("John",2);
//		s1.display();
		
//		Student1 s2=new Student1();
//		Student1 s3=new Student1();
//		
//		s2.insert(01, 9876543210l, "Sam");
//		s2.display();
//		
//		s3.insert(02, 9876787678l, "John");
//		s3.display();
		
		Employee [] e1 = new Employee[4];
		
		
		 e1[0] = new Employee("Sam",101);
		 e1[1] = new Employee("John",201);
		 e1[2]= new Employee("Sid",301);
		 e1[3]= new Employee("Joe",401);
	
		
		e1[0].display();
		e1[1].display();
		e1[2].display();
		e1[3].display();
		

		
		
		
	}
	
	

}
