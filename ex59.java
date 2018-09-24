
public class ex19 {
	int id;  
		    String name;  
	      
		    ex19(int id,String name){  
		    this.id = id;  
		    this.name = name;  
		    }  
	    void display(){System.out.println(id+" "+name);}  
		    public static void main(String args[]){  
	    ex19 s1 = new ex19(111,"Karan");  
		    ex19 s2 = new ex19(222,"Aryan");  
		    s1.display();  
		    s2.display();  
		    }  
	}  
