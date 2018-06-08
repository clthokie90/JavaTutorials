
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In a loop print a range of numbers from 1...n on each line
		// incrementing n by 1 after each iteration 
		
		for (int i=1; i<=6; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		for (int i=1; i<=6; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		
		for (int i=65; i<=67; i++) {
			for (int j=65; j<=i; j++) {
				System.out.print((char)j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//print out a box of $
		int j = 4;
		for (int i=1; i<=j; i++) {
			if (i==1 || i==j) {
				for (int x=1; x<=j; x++) {
				  System.out.print("$ ");
				}  
			}
			else {
				for (int x=1; x<=j; x++) {
					if (x==1 || x==4) 
					  System.out.print("$ ");
					else
					  System.out.print("  ");
				}  
			}
			System.out.println();
		}
		
	}

}
