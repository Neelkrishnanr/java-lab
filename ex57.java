
public class ex17 {


	  int rollno;  
	  String name;  
		     static String college = "ITS";  
		       
		     static void change(){  
		     college = "BBDIT";  
			     }  
			  
		     ex17(int r, String n){  
			     rollno = r;  
		     name = n;  
			     }  
			  
		     void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		    public static void main(String args[]){  
		    ex17.change();  
		  
		    ex17 s1 = new ex17(111,"Karan");  
		    ex17 s2 = new ex17 (222,"Aryan");  
			 ex17 s3 = new ex17(333,"Sonoo");  
			  
		    s1.display();  
		   s2.display();  
		    s3.display();  
		    }  
		}  
