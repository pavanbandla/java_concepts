

// interfaces
// functional interfaces contains only one method in it.  

interface Newclass{
//	void javabook(String startDate, String endDate);	
	double javabook(String startDate, String endDate);	
}

///////////MAIN CLASS///////////////////////


public class interfaces {
	public static void main(String[] args) {
	
		 
		//////method 1...
		
//		Newclass object1 = new subclass();
//		object1.javabook();	
//	}
//}
//
//	class subclass implements Newclass{
//		public void javabook(){
//			System.out.println("Hello there this is one of the method to implement in java interfaces");
//	}
//		
	
		//METHOD 2...
		
		
		//Anonymous class implementation  
//		Newclass object1 =new Newclass() {
//			@Override
//			public void javabook() {
//				System.out.println("welcome motherFucker this is second method to implement java interfaces");
//			}
//		};
//		object1.javabook();
		
		
		
		//3rd METHOD......
		  
		 //USING LAMBDA EXPRESSIONS...--> only works with functional interfaces 
		 //below one is zero parameter lambda expression
//		 Newclass object1 = (startDate, endDate)->{
//			System.out.println("Third method to implement interfaces is Lambda expressions.... " +startDate+" is the start date and " +endDate+ " is the end date");
//			return 476.45;
//		 };

//		double fair = object1.javabook("June","September"); 
//	    System.out.println("fair is " + fair);
	


		

	}
} 

