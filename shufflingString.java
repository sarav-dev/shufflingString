import java.util.*;

public class shufflingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in lowercase: ");
        String A = sc.nextLine();
        // System.out.println("Enter array size: ");
        int B[] = new int[A.length()];
        System.out.print("Enter array elements: ");
        for (int i=0; i<A.length(); i++) {
            B[i] = sc.nextInt();
        }
        
        sc.close();
        String shuffledString = solve(A,B);
        System.out.println();
        System.out.println("Shuffled String: " + shuffledString);
    }

    public static String solve(String A, int[] B) {
        char shufflledChars[] = new char[A.length()];
        for (int i=0; i<A.length(); i++) {
            int j = B[i];
            shufflledChars[j] = A.charAt(i);
            System.out.print(shufflledChars[j] + " ");
        }
        return new String(shufflledChars); 
    }
}