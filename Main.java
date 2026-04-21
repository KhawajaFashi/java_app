public class Main {
    public static void main(String[] args) {
        // Unused variable - often flagged by static analysis
        String unused = "I am not used";
        
        System.out.println("Hello, Java Static Analysis!");
        
        // Potential NullPointerException - some analyzers catch this
        String s = null;
        if (args.length > 10) {
            System.out.println(s.length());
        }
    }
}
