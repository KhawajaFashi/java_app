import java.util.Random;

public class QualityAudit {
    public static void main(String[] args) {
        // Issue 1: Insecure Random number generation (Security)
        // Static analysis tools recommend using SecureRandom
        Random rand = new Random();
        int id = rand.nextInt();

        System.out.println("Processing ID: " + id);

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // Issue 2: Empty catch block (Best Practice)
            // Analyzers will flag this as poor error handling
        }
        
        // Issue 3: Naming convention (Naming Violation)
        // Variable names should be camelCase
        int User_Age_Record = 25;
        
        // Issue 4: Dead code (Style/Optimization)
        if (false) {
            System.out.println("This code is unreachable");
        }
    }
}
