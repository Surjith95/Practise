package starPrograms;

public class Star2 {

	// F type star program
	public static void main(String[] args) {
		int n = 5; 
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
