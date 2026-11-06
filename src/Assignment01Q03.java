public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); // TODO: Read the first string argument (replace this line)
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int numOdd = 0;
        int curr = 1;
        int prev = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(curr);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            if (curr % 2 == 1) 
                numOdd++;
            int next = curr + prev;
            prev = curr;
            curr = next;
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
