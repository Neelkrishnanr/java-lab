
public class ex25 {
		ex25 getA(){  
			return this;  
			}  
			void msg(){System.out.println("Hello java");}  
			}  
	class Test1{  
			public static void main(String args[]){  
			new ex25().getA().msg();  
			}  
			}  

