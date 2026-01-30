// Login Security


// Login allow hoga jab:
// Scenario:

// accountActive = true AND (loginAttempts <= 3 OR role = "ADMIN")

// Agar login allowed → loginAttempts++


public  class Q7 {
    public static void main(String[] args) {
        int loginAttempts = 4;
        boolean accountActive = true;
        String role = "ADMIN";

        boolean loginAllowed = accountActive && (loginAttempts <= 3 || role.equals("ADMIN")) ? true : false;

        if(loginAllowed) {
            loginAttempts++; // increment attempts for record
        }

        System.out.println("Login Allowed: " + loginAllowed);
        System.out.println("Updated Login Attempts: " + loginAttempts);
    }
}
