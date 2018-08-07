package ex3;

public class ex3 {
	int rollno;  
	 String name;  
	  
	 void insertRecord(int r, String n){  //method  
	  rollno=r;  
	  name=n;  
	 }  
	  
	 void displayInformation(){System.out.println(rollno+" "+name);}//method  
	  
	 public static void main(String args[]){  
	  ex3 s1=new ex3();  
	  ex3 s2=new ex3();  
	  
	  s1.insertRecord(311,"neel");  
	  s2.insertRecord(322,"narendran");  
	  
	  s1.displayInformation();  
	  s2.displayInformation();  
	  
	 }  
	}  