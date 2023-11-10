package patternofname;

public class vaishuname {
	public static void main(String[] args) {
        int n = 9;
        
        // Pattern 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j && i <= (n - 1) / 2) || (i + j == n - 1 && j >= (n - 1) / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // Add space between patterns
            System.out.print("  ");
            
            // Pattern 2
            for (int j = 0; j < n; j++) {
                if ((i == j && i >= (n - 1) / 2) || (i + j == n - 1 && j <= (n - 1) / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }
}