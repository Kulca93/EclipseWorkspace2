
public class IntermediateExercises {
		
	
		int numOne;
		int numTwo;
		int numThree;
		static int numSum;

		
	public static void main(String[] args) {

		System.out.println("Blackjack");
		System.out.println(blackJack(21, 21));
		System.out.println("Unique Sum");
		System.out.println(uniqueSum(10, 5, 8));
}
	
	public static int blackJack(int numOne, int numTwo) {
		if ( numOne > 0 && numTwo > 0 ) {
			if( numOne <= 21 && numTwo <= 21) {
				
				if(numOne > numTwo) {		
					System.out.print("The Highest Value is: ");
					return numOne;
					
				} else if (numOne == numTwo) {
					System.out.print("They both equal: ");
					return numOne;		
				}
					
				 else {
					System.out.print("The Highest Value is: ");
					return numTwo;
				}
				
			} else {
				
				return 0;
				
			}
			
		} else {
			
			System.out.print("Enter Values over ");
			return 0;
		}
		
		
	}
	
	public static int uniqueSum (int numOne, int numTwo, int numThree) {
			if(numOne == numTwo && numOne != numThree) {
				numSum = numOne + numThree;
				return numSum;
			}
			else if(numOne == numThree && numOne != numTwo) {
				numSum = numOne + numTwo;
				return numSum;
						
			}
			else if(numTwo == numThree && numTwo != numOne) {
				numSum = numOne + numTwo;
				return numSum;
			}
			else if(numOne == numTwo && numTwo == numThree) {
				numSum = 0;
				return numSum;
			}
			else {
				numSum = numOne + numTwo + numThree;
				return numSum;
			}
		
	}
}
	



