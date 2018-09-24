
public class ex13 {
	 
	   int id;  
	    String name;  
	      
		    ex13(int i,String n){  
	    id = i;  
		    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
   
	   public static void main(String args[]){  
	   ex13 s1 = new ex13(111,"Karan");  
	   ex13 s2 = new ex13(222,"Aryan");  
			    s1.display();  
			    s2.display();  
		  }  
			}  
