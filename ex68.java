
public class ex28 {
	
		 int square(int n){  
			  return n*n;  
			 }  
			}  
			  
			class Circle{  
			 ex28 op;//aggregation  
			 double pi=3.14;  
			    
			 double area(int radius){  
			   op=new ex28();  
			   int rsquare=op.square(radius);  
			   return pi*rsquare;  
			 }  
		  
			     
			    
			 public static void main(String args[]){  
			   Circle c=new Circle();  
			   double result=c.area(5);  
			  	   System.out.println(result);  
			  	 }  
			   	}  
