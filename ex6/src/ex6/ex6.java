package ex6;

public class ex6 {
	int length;  
	 int width;  
	  
	 void insert(int l,int w){  
	  length=l;  
	  width=w;  
	 }  
	  
	 void calculateArea(){System.out.println(length*width);}  
	  
	 public static void main(String args[]){  
	  ex6 r1=new ex6(),r2=new ex6();//creating two objects  
	    
	  r1.insert(11,5);  
	  r2.insert(2,15);  
	  
	  r1.calculateArea();  
	  r2.calculateArea();  
	}  
	}  