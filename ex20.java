
public class ex20 {
		    int id;  
    String name;  
    ex20(){System.out.println("default constructor is invoked");}  
	      
    ex20(int id,String name){  
		    this (); //it is used to invoked current class constructor.  
		    this.id = id;  
	    this.name = name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  
		      
		    public static void main(String args[]){  
		    ex20 e1 = new ex20(111,"karan");  
		    ex20 e2 = new ex20(222,"Aryan");  
	    e1.display();  
		    e2.display();  	  
		    }  
		}  
