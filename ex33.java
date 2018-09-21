	public class ex33{
 ex33(){System.out.println("Vehicle is created");}  
	}  	  
	class Bike5 extends ex33{  
	  Bike5(){  
	   super();//will invoke parent class constructor  
	   System.out.println("Bike is created");  
	  }  
	  public static void main(String args[]){  
	   Bike5 b=new Bike5();  
	        
	}  
	}  

