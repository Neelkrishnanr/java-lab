
public class ex23 {
	void m(ex23 obj){  
			  System.out.println("method is invoked");  
			  }  
			  void p(){  
			  m(this);  
			  }  
			    
			  public static void main(String args[]){  
			  ex23 s1 = new ex23();  
			  s1.p();  
			  }  
			}  

