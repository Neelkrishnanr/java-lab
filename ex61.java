
public class ex21 {
	int id;  
		    String name;  
		    String city;  
		      
		   ex21(int id,String name){  
	    this.id = id;  
	    this.name = name;  
		    }  
		    ex21(int id,String name,String city){  
		    this(id,name);//now no need to initialize id and name  
		    this.city=city;  
    }  
	    void display(){System.out.println(id+" "+name+" "+city);}  
	      
	public static void main(String args[]){  
		ex21 e1 = new ex21(111,"karan");  
	    ex21 e2 = new ex21(222,"Aryan","delhi");  
	    e1.display();  
		    e2.display();  
		   }  
		}  
