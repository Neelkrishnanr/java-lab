
public class ex18 {
	    int id;  
		    String name;  
	      
	    ex18(int id,String name){  
	    id = id;  
	    name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	    
	    public static void main(String args[]){  
		    ex18 s1 = new ex18(111,"Karan");  
		    ex18 s2 = new ex18(321,"Aryan");  
		    s1.display();  
		    s2.display();  
	    }  
	}  

