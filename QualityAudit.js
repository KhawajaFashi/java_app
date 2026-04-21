// Issue 1: Insecure Random number generation (Security)
// Static analysis tools recommend using crypto.getRandomValues for cryptographic security
const id = Math.floor(Math.random() * 1000000);

console.log("Processing ID: " + id);

try {
    // In JavaScript, 10 / 0 results in Infinity, not an exception. 
    // However, to mimic the quality audit issue structure for static analysis demos:
    const result = 10 / 0;
} catch (e) {
    // Issue 2: Empty catch block (Best Practice)
    // Analyzers will flag this as poor error handling
}

// Issue 3: Naming convention (Naming Violation)
// Variable names should be camelCase
const User_Age_Record = 25;

// Issue 4: Dead code (Style/Optimization)
if (false) {
    console.log("This code is unreachable");
}
