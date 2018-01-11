
public class Beginner {
	
	static boolean tof = false;
	
	public static void main(String[] args) {
		Beginner obj = new Beginner();
		obj.printWord("HelloWorld!?!?");
		System.out.println("Conditional");
		System.out.println(addSum(5,0, tof));
		System.out.println(addSum(0,5, tof));
		System.out.println("Iteration");
		obj.iteration();
		System.out.println("Array");
		obj.array();

		
	}
	
	public void printWord(String text) {
		System.out.println(text);
	}
	
	public static int addSum(int a, int b, boolean ifSum) {
		
		int result;
		
		if (a == 0) {
			
			result = b;
		}
		
		else if (b == 0) {
			
			result = a;
		}
		
		else if(ifSum) {
			
			result = a + b;
			
		}	else {
			
			result = a * b;
		}
		
		
		return result;
		
	}
	
	public void iteration() {
		for (int i=0; i<10;i++) {
		
		System.out.println(addSum(i, i*2, tof));
		
		}
		
	}
	
	public void array() {
		int[] anArray = {1,2,3,4,5,6,7,8,9,10};
		
		
		System.out.println(addSum(anArray[0], anArray[6], tof));		
		System.out.println("Array/Iteration");
		for (int j=0; j<10; j++) {
			if(j < 9) {
				System.out.printf(anArray[j] + ", ");
			} else {
				System.out.printf(anArray[j] + ".");
				
			}
			
			
			
		}
		System.out.println("");
		for (int j=0; j<10; j++) {
			if( j < 9) {
				
			System.out.printf(anArray[j]*10 + ", " );
			
			} else {
				
				System.out.printf(anArray[j]*10 + "." );
			}
		}
		
		
		
		
	}
	
	
	
	
}
