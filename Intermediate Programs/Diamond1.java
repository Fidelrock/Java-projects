// This program prints out diamond shape
public class Diamond1 {
	public static void main(String[] args){
		diamond_Asterisk(9);
        diamond_Asterisk2(9);
	}
    //method 1 
    public static int diamond_Asterisk(int num) {
		int m,n;
		//printing first half of the pattern
        for (m = 1; m <= num; m++) {
			for (n = 1; n <= num - m; n++) {
				System.out.print(" ");
            }
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}
			//newline at the end of each row
			System.out.println();
		}
		return num;
    }
	//method 2
    public static int diamond_Asterisk2(int num) {
		int m,n;

		// Prints the second half diamond
		for (m = num - 1; m > 0; m--) {

			// Inner loop 1 print whitespaces inbetween
			for (n = 1; n <= num - m; n++) {
				System.out.print(" ");
			}
			// Inner loop 2 print star
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}
			// Ending line after each row
			System.out.println(" ");
		}
		return num;
    }
}
